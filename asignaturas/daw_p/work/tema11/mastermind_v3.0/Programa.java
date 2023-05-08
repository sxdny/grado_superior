// ===========================================
// == MASTERMIND JAVA - SIDNEY SILVA 1º DAW ==
// ===========================================

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

import resources.Codigo;
import resources.Colores;
import resources.Usuario;
// import resources.Partida;
// import resources.Tirada;

public class Programa {

    // lista usuarios
    static Vector<Usuario> usuarios = new Vector<>(0);
    // usuario actual de la partida
    static Usuario usuarioActual = new Usuario();

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

    public static void main(String[] args) throws IOException {

        // directorio y archivo donde guardamos las partidas
        File directorio = new File("./partidas");
        File partidas = new File("./partidas/partidas.txt");

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

        limpiarConsola();

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
                crearUsuario(usuarios);
            }

            if (opc == 2) {
                listarUsuario(usuarios);
            }

            if (opc == 3) {
                seleccionarUsuario(usuarioActual, usuarios);
                salir = true;
            }

            if (opc > 5 || opc <= 0) {
                System.out.println("No has introducido una opcion valida...");
            }

        } while (salir != true || opc != 4);

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
    public static void crearUsuario(Vector<Usuario> usuarios) {
        // declaracion de variables
        String nombreUsuario = new String();
        boolean flag = false;

        /*
         * si la lista de usuarios no tiene ningún usuario, se
         * crea el usuario directamente
         */
        if (usuarios.isEmpty()) {
            System.out.println("Introduce el nombre de usuario:");
            nombreUsuario = sc.nextLine();

            nombreUsuario = nombreUsuario.toUpperCase();

            Usuario usuario = new Usuario(usuarios.size() + 1, nombreUsuario, 0);
            usuarios.add(usuario);
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
                for (int i = 0; i < usuarios.size(); i++) {
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

            Usuario usuario = new Usuario(usuarios.size() + 1, nombreUsuario, 0);
            usuarios.add(usuario);
            System.out.println("Usuario creado correctamente!");

        }
    }

    // TODO substituir por lectura de un archivo
    public static void listarUsuario(Vector<Usuario> usuarios) {
        // recorremos el vector y mostramos los datos de los usuarios
        System.out.println("Lista de usuarios y puntuaciones:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println(usuarios.get(i).toString());
        }
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
