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

    static File directorio = new File("./partidas"); // directorio para guardar las partidas (más orden)
    static File partidas = new File("./partidas/partidas.dat"); // archivo para guardar la lista de usuarios

    static Usuario usuarioActual = new Usuario(); // usuario actual de la partida
    static Vector<Usuario> usuariosArchivo = new Vector<>(1); // lista de usuarios del archivo "partidas.dat"

    static Scanner sc = new Scanner(System.in);

    static Colores colores = new Colores(); // objeto colores
    static Codigo codigo = new Codigo(); // objeto codigo

    static String[] inputUsuario = new String[4]; // input usuario

    // variables para el correcto funcionamiento de la partida
    static boolean resuelto = false;
    static int intentos = 0;
    static int coloresPC = 0;
    static int coloresPI = 0;

    static int opc = 0;
    static boolean salir = false;

    public static void main(String[] args) throws IOException, ClassNotFoundException, EOFException {

        System.out.println("Creando directorio partidas...");
        if (directorio.exists()) {
            System.out.println("El directorio ya existe.");
        } else {
            directorio.mkdir(); // creamos el directorio si no existe
        }

        System.out.println("Creando archivo partidas...");
        if (partidas.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            partidas.createNewFile(); // creamos el archivo "partidas" si no existe
        }

        /*
         * Leemos el archivo ANTES DE EMPEZAR para que no se
         * sobreesciba el archivo cada vez que entramos al programa.
         */

        if (partidas.length() == 0) {
            // si el archivo está vacio, no creamos ningún objeto para leerlo
            // sino nos da un EOFException
        } else { // si el archivo no está vacio...

            FileInputStream fis = new FileInputStream(partidas);
            ObjectInputStream ois = new ObjectInputStream(fis);

            try {

                while (true) { // recorremos el archivo
                    Usuario usuario = (Usuario) ois.readObject();
                    usuariosArchivo.add(usuario);
                }

            } catch (EOFException eof) { // capturamos la excepcion de fin del archivo
                System.out.println("Final del archivo");
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }

            ois.close();

        }

        limpiarConsola();

        do { // menú para gestionar los usuarios

            System.out.println();

            System.out.println("Menu usuarios");
            System.out.println("Introduce una opcion:");
            System.out.println("1. Crear nuevo usuario...");
            System.out.println("2. Listar todos los usuarios y puntuaciones...");
            System.out.println("3. Seleccionar usuario para empezar una partida...");
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
                seleccionarUsuario(usuarioActual, usuariosArchivo);
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

        codigo.generarCodigoAleatorio(codigo, colores); // generamos el código secreto

        System.out.println("Codigo secreto: " + codigo.toString()); // respuesta (para testing)

        do {
            System.out.println("Introduce una serie de 4 colores:");

            for (int i = 0; i < inputUsuario.length; i++) { // capturamos el input del usuario posición por posición
                inputUsuario[i] = sc.next();
                inputUsuario[i] = inputUsuario[i].toUpperCase(); // transformamos a mayúsculas para evitar problemas
                                                                 // comparando
            }

            for (int i = 0; i < codigo.codigo.length; i++) { // comprobamos si los colores que están en la misma
                                                             // posición
                if (inputUsuario[i].equals(codigo.codigo[i])) {
                    coloresPC++;
                }
            }

            for (int i = 0; i < codigo.codigo.length; i++) { // comprobamos que los colores introducido por el usuario
                                                             // están pero no en la posición correcta
                for (int j = 0; j < codigo.codigo.length; j++) {
                    if (inputUsuario[i].equals(codigo.codigo[j])) {
                        if (inputUsuario[j].equals(codigo.codigo[j])) {
                        } else {
                            coloresPI++;
                        }
                    }
                }
            }

            if (coloresPC == 4) { // si llega a 4, significa que ya se ha resuelto el código
                resuelto = true;
            }

            intentos++;

            System.out.println("Input del usuario: " + Arrays.toString(inputUsuario));
            System.out.println("[" + coloresPC + " , " + coloresPI + "]");
            System.out.println("Nº de intentos: " + intentos);

            coloresPC = 0;
            coloresPI = 0;

        } while (resuelto == false && intentos != 16); // se repite hasta que se haya resuelto el codigo o hasta que
                                                       // llegue a 16 intentos

        if (intentos == 16 && resuelto == false) {
            System.out.println("Has perdido... :("); // mensaje partida perdida
            System.out.println("La solucion era: " + codigo.toString());
        } else {
            System.out.println("HAS GANADO LA PARTIDA."); // mensaje partida ganada
            System.out.println("Nº intentos: " + intentos);
        }

    }

    public static void crearUsuario() throws IOException { // metodo para crear usuarios

        limpiarConsola();

        // escritura de usuarios en el archivo
        FileOutputStream fos = new FileOutputStream(partidas);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String nombreUsuario = new String();
        boolean flag = false;

        if (usuariosArchivo.size() == 0) { // si el archivo está vacio, el usuario se creará sin comparaciones ni nada
            System.out.println("Introduce el nombre de usuario:");
            nombreUsuario = sc.nextLine();

            nombreUsuario = nombreUsuario.toUpperCase();

            Usuario usuario = new Usuario(usuariosArchivo.size() + 1, nombreUsuario, 0);
            usuariosArchivo.add(usuario);
            System.out.println("Usuario creado correctamente!");
        } else { // si el archivo ya contiene usuarios, no dejaremos que los usuarios se repitan

            System.out.println("Introduce el nombre de usuario:");
            nombreUsuario = sc.nextLine();
            nombreUsuario = nombreUsuario.toUpperCase();

            do {
                for (int i = 0; i < usuariosArchivo.size(); i++) {
                    if (usuariosArchivo.get(i).getNombre().equals(nombreUsuario)) { // comparamos los dos nombres
                        System.out.println("El nombre de usuario ya existe...");
                        System.out.println("Introduce otro nombre de usuario:");

                        nombreUsuario = sc.nextLine();
                        nombreUsuario = nombreUsuario.toUpperCase();
                    } else {
                        flag = true;
                    }
                }

            } while (flag != true);

            Usuario usuario = new Usuario(usuariosArchivo.size() + 1, nombreUsuario, 0);
            usuariosArchivo.add(usuario); // introducimos el usuario en el Vector
            System.out.println("Usuario creado correctamente!");

            for (Usuario usuario2 : usuariosArchivo) { // escribir objeto en el archivo
                oos.writeObject(usuario2);
            }

            oos.flush();
            oos.close(); // importante cerrar el archivo

        }
    }

    public static void listarUsuario() throws IOException, ClassNotFoundException { // método listar usuarios

        limpiarConsola();

        FileInputStream fis = new FileInputStream(partidas);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Lista de usuarios y puntuaciones:");

        try {
            while (true) { // recorremos el archivo
                Usuario usuario = (Usuario) ois.readObject();
                System.out.println(usuario.toString());
            }
        } catch (EOFException eof) { // excepción de final de archivo
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        ois.close();

    }

    public static void seleccionarUsuario(Usuario uA, Vector<Usuario> usuarios) throws IOException {

        limpiarConsola();

        int idUser = 0;
        boolean select = false;

        System.out.println();

        FileInputStream fis = new FileInputStream(partidas);
        ObjectInputStream ois = new ObjectInputStream(fis);

        System.out.println("Introduzca el ID de uno de los siguientes usuarios para empezar:");

        System.out.println();

        try {
            while (true) { // recorremos el archivo
                Usuario usuario = (Usuario) ois.readObject();
                System.out.println(usuario.toStringEssentials());
            }
        } catch (EOFException eof) { // excepción de final de archivo
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        ois.close();

        System.out.println();

        // hacer while loop
        do {

            idUser = sc.nextInt();
            sc.nextLine();

            for (Usuario usuario : usuariosArchivo) {
                if (idUser == usuario.getId()) {
                    usuarioActual = usuario;
                    select = true;
                }
            }

            if (select == false) {
                System.out.println();
                System.out.println("No se ha encotrado el ID de usuario...");
                System.out.println("Introduce otro ID de usuario");
                System.out.println();
            }

        } while (select == false);

        System.out.println();
        System.out.println("Usuario seleccionado:");
        System.out.println(usuarioActual.toString());
        System.out.println();

    }

    public static void limpiarConsola() { // metodo limpiar la consola
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
