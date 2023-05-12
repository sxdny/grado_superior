// ===========================================
// == MASTERMIND JAVA - SIDNEY SILVA 1º DAW ==
// ===========================================

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import resources.Codigo;
import resources.Colores;
import resources.Usuario;
// import resources.Partida;
// import resources.Tirada;

public class Programa {

    // directorio y archivo donde guardamos las partidas
    static File directorio = new File("./partidas");
    static File partidas = new File("./partidas/partidas.dat");

    // lista usuarios
    static Vector<Usuario> usuarios = new Vector<>(0);
    // usuario actual de la partida
    static Usuario usuarioActual = new Usuario();
    static Vector<Usuario> usuariosArchivo = new Vector<>(1);

    // creamos un Scanner
    static Scanner sc = new Scanner(System.in);

    // creamos los objetos Colores y Codigo
    static Colores colores = new Colores();
    static Codigo codigo = new Codigo();

    // definimos la variable para el input del usuario
    static String[] inputUsuario = new String[4];

    // definir variables resuelto, intentos, coloresPC
    // para los colores en la posición correcta y
    // coloresPI para los colores en la posición
    // incorrecta
    static boolean resuelto = false;
    static int intentos = 0;
    static int coloresPC = 0;
    static int coloresPI = 0;

    static int opc = 0;
    static boolean salir = false;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // CREACION DE DIRECTORIO + ARCHIVO

        // creamos el directorio si no existe
        System.out.println("Creando directorio partidas...");
        if (directorio.exists()) {
            System.out.println("El directorio ya existe.");
        } else {
            directorio.mkdir();
        }

        // creamos el archivo "partidas" si no existe
        System.out.println("Creando archivo partidas...");
        if (partidas.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            partidas.createNewFile();
        }

        /*
         * Leemos el archivo antes de empezar para que no se
         * sobreesciba el archivo cada vez que insertamos un nuevo
         * usuario en este caso.
         */
    
        // Leemos el archivo para obtener los usuarios existentes

        FileInputStream fis = new FileInputStream(partidas);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        System.out.println("Lista de usuarios y puntuaciones:");

        try {

            // recorremos el archivo
            while (true) {
                Usuario usuario = (Usuario) ois.readObject();
                usuariosArchivo.add(usuario);
            }

            // capturamos la excepcion de fin del archivo
        } catch (EOFException eof) {
            System.out.println("Final del archivo");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        ois.close();

        // gestion usuarios
        do {

            System.out.println("Menu usuarios");
            System.out.println("Introduce una opcion:");
            System.out.println("1. Crear nuevo usuario...");
            System.out.println("2. Listar todos los usuarios y puntuaciones...");
            System.out.println("3. Seleccionar usuario...");
            System.out.println("4. Salir del programa...");

            opc = sc.nextInt();
            sc.nextLine();

            if (opc == 1) {
                crearUsuario();
            }

            if (opc == 2) {
                listarUsuario();
            }

            if (opc == 3) {
                seleccionarUsuario(usuarioActual, usuarios);
                salir = true;
            }

            if (opc >= 5 || opc <= 0) {
                System.out.println("No has introducido una opcion valida...");
            }

        } while (salir != true && opc != 4);

        if (opc == 4) {
            System.out.println("Has salido correctamente del programa...");
            System.exit(0);
        }

        // generamos el código secreto
        codigo.generarCodigoAleatorio(codigo, colores);

        // para hacer pruebas con el programa
        System.out.println("Codigo secreto: " + codigo.toString());

        // TODO hacer metodo para crear usuario y guardar en el archivo

        do {
            System.out.println("Introduce una serie de 4 colores:");

            // input del usuario 1x1
            for (int i = 0; i < inputUsuario.length; i++) {
                inputUsuario[i] = sc.next();
                // transformamos a mayúsculas para evitar problemas comparando
                inputUsuario[i] = inputUsuario[i].toUpperCase();
            }

            // comprobamos los colores que están en la misma posición
            for (int i = 0; i < codigo.codigo.length; i++) {
                if (inputUsuario[i].equals(codigo.codigo[i])) {
                    coloresPC++;
                }
            }

            // comprobamos los colores que forman parte del código
            // secreto pero no están correctamente posicionados
            for (int i = 0; i < codigo.codigo.length; i++) {
                for (int j = 0; j < codigo.codigo.length; j++) {
                    if (inputUsuario[i].equals(codigo.codigo[j])) {
                        if (inputUsuario[j].equals(codigo.codigo[j])) {
                        } else {
                            coloresPI++;
                        }
                    }
                }
            }

            // si la variable "coloresPC" llega a un valor de 4,
            // significa que se ha resuelto el código y por lo
            // tanto pasamos la variable "resuelto" a true.
            if (coloresPC == 4) {
                resuelto = true;
            }

            // sumamos un intento
            intentos++;

            // mostramos el código introducido por el usuario, los
            // valores de "coloresPC" y "coloresPI" y el nº de intentos
            System.out.println("Input del usuario: " + Arrays.toString(inputUsuario));
            System.out.println("[" + coloresPC + " , " + coloresPI + "]");
            System.out.println("Nº de intentos: " + intentos);

            // reseteamos los valores de las variables
            coloresPC = 0;
            coloresPI = 0;
        } while (resuelto == false && intentos != 16);

        if (intentos == 16 && resuelto == false) {
            System.out.println("Has perdido... :(");
            System.out.println("La solucion era: " + codigo.toString());
        } else {
            System.out.println("HAS GANADO LA PARTIDA.");
            System.out.println("Nº intentos: " + intentos);
        }

    }

    // metodo para crear usuarios
    public static void crearUsuario() throws IOException {

        // escritura de usuarios en el archivo
        FileOutputStream fos = new FileOutputStream(partidas);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Student[] studentsFromSavedFile = (Student[]) ois.readObject();

        // declaracion de variables
        String nombreUsuario = new String();
        boolean flag = false;

        /*
         * si la lista de usuarios no tiene ningún usuario, se
         * crea el usuario directamente
         */
        if (usuariosArchivo.isEmpty()) {
            System.out.println("Introduce el nombre de usuario:");
            nombreUsuario = sc.nextLine();

            nombreUsuario = nombreUsuario.toUpperCase();

            Usuario usuario = new Usuario(usuariosArchivo.size() + 1, nombreUsuario, 0);
            usuariosArchivo.add(usuario);
            System.out.println("Usuario creado correctamente!");
        }
        // si la lista de usuarios ya contiene usuarios dentro:
        else {
            // pedimos el nombre de usuario
            System.out.println("Introduce el nombre de usuario:");
            nombreUsuario = sc.nextLine();
            nombreUsuario = nombreUsuario.toUpperCase();

            /*
             * mientras el nombre de usuario introducido no sea
             * diferente a uno ya existente, se repetira el bucle.
             */
            do {
                for (int i = 0; i < usuariosArchivo.size(); i++) {
                    if (usuarios.get(i).getNombre().equals(nombreUsuario)) {
                        System.out.println("El nombre de usuario ya existe...");
                        // volvemos a preguntar el nombre de usuario
                        System.out.println("Introduce otro nombre de usuario:");
                        nombreUsuario = sc.nextLine();
                        nombreUsuario = nombreUsuario.toUpperCase();
                    } else {
                        System.out.println("Nombre de usuario disponible!");
                        /*
                         * establecemos el valor de la variable "flag" a true
                         * para que salga del buble
                         */
                        flag = true;
                    }
                }

            } while (flag != true);

            Usuario usuario = new Usuario(usuariosArchivo.size() + 1, nombreUsuario, 0);
            usuariosArchivo.add(usuario);
            System.out.println("Usuario creado correctamente!");

            // escribir objeto en el archivo
            for (Usuario usuario2 : usuarios) {
                oos.writeObject(usuario2);
            }

            oos.flush();
            oos.close();

        }
    }

    public static void listarUsuario() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(partidas);
        ObjectInputStream ois = new ObjectInputStream(fis);
        

        System.out.println("Lista de usuarios y puntuaciones:");
        
        try {

            // recorremos el archivo
            while (true) {
                Usuario usuario = (Usuario) ois.readObject();
                System.out.println(usuario.toString());
            }

            // capturamos la excepcion de fin del archivo
        } catch (EOFException eof) {
            // Arriba al final del archivo
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        ois.close();

    }

    // TODO substituir por seleccion de usuario de un archivo
    public static void seleccionarUsuario(Usuario uA, Vector<Usuario> usuarios) {

        limpiarConsola();

        boolean flag = false;

        System.out.println("Seleccione uno de los siguientes usuarios introduciendo su ID:");

        do {
            for (Usuario usuario : usuarios) {
                usuario.toStringEssentials();
            }

            int id = sc.nextInt();
            sc.nextLine();

            for (Usuario usuario : usuarios) {
                if (usuario.getId() == id) {
                    usuarioActual = usuario;
                    flag = true;
                } else {
                    System.out.println("El id introducido no es correcto o no existe.");
                }
            }
        } while (flag != true);

    }

    // metodo limpiar la consola
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}