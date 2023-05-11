import java.util.HashMap;
import java.util.Scanner;

public class Main {
    
    static int op = 0;
    static int alumnosCreados = 0;
    static HashMap<String, Alumno> alumnos = new HashMap<String, Alumno>();
    static int profesoresCreados = 0;
    static HashMap<String, Profesor> profesores = new HashMap<String, Profesor>();
    static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {

        do {
            System.out.println("1. Crear nuevo alumno.");
            System.out.println("2. Crear nuevo profesor.");
            System.out.println("3. Mostrar todos los alumnos.");
            System.out.println("4. Mostrar todos los profesores.");
            System.out.println("5. Mostrar todas las personas.");
            System.out.println("6. Salir del programa.");

            op = lector.nextInt();
            lector.nextLine();

            if (op == 1) {
                crearAlumno();
            }

            if (op == 2) {
                crearProfesor();
            }

            if (op == 3) {
                mostrarAlumnos();
            }

            if (op == 4) {
                mostrarProfesores();
            }

            if (op == 5) {
                mostrarTodo();
            }

            if (op < 0 || op >= 7) {
                System.out.println("No has elegido una opcion valida.");
            }


        } while (op != 6);
        System.out.println("Has salido del programa.");
    }

    public static void crearAlumno() {
        System.out.println("Introduzca su nombre:");
        String nomPersona = lector.nextLine();

        System.out.println("Introduzca tu DNI:");
        String dniPersona = lector.nextLine();

        System.out.println("Introduzca su edad:");
        int edadPersona = lector.nextInt();
        lector.nextLine();

        System.out.println("Introduzca su nivel academico:");
        String nivelAc = lector.nextLine();

        alumnos.put(dniPersona, new Alumno(nomPersona, dniPersona, edadPersona, nivelAc));
        alumnosCreados = alumnosCreados + 1;
    }

    public static void crearProfesor() {
        System.out.println("Introduzca su nombre:");
        String nomPersona = lector.nextLine();

        System.out.println("Introduzca tu DNI:");
        String dniPersona = lector.nextLine();

        System.out.println("Introduzca su edad:");
        int edadPersona = lector.nextInt();
        lector.nextLine();

        System.out.println("Introduzca la asignatura que ensenya:");
        String assignatura = lector.nextLine();

        profesores.put(dniPersona, new Profesor(nomPersona, dniPersona, edadPersona, assignatura));
        profesoresCreados = profesoresCreados + 1;
    }

    public static void mostrarProfesores() {
        System.out.println("Lista de profesores: ");
        for (int i = 0; i < profesoresCreados; i++) {
            System.out.println(profesores.get(i));
        }
    }

    public static void mostrarAlumnos() {
        System.out.println("Lista de alumnos: ");
        for (int i = 0; i < alumnosCreados; i++) {
            System.out.println(alumnos.get(i));
        }
    }

    public static void mostrarTodo() {
        System.out.println("Todas las personas:");

        for (int i = 0; i < profesoresCreados; i++) {
            System.out.println(profesores.get(i));
        }
        for (int i = 0; i < alumnosCreados; i++) {
            System.out.println(alumnos.get(i));
        }
    }
}
