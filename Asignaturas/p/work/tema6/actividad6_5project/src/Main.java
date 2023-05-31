import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    
    static int op = 0;
    static int alumnosCreados = 0;
    static Alumno[] alumnos = new Alumno[100];
    static int profesoresCreados = 0;
    static Profesor[] profesores = new Profesor[100];

    static File partidas = new File("personas.txt");

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {

        Ventana ventana = new Ventana();

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        alumnos[alumnosCreados] = new Alumno(nomPersona, dniPersona, edadPersona, nivelAc);
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

        profesores[profesoresCreados] = new Profesor(nomPersona, dniPersona, edadPersona, assignatura);
        profesoresCreados = profesoresCreados + 1;
    }

    public static void mostrarProfesores() {
        System.out.println("Lista de profesores: ");
        for (int i = 0; i < profesoresCreados; i++) {
            System.out.println(profesores[i].mostrarDades());
        }
    }

    public static void mostrarAlumnos() {
        System.out.println("Lista de alumnos: ");
        for (int i = 0; i < alumnosCreados; i++) {
            System.out.println(alumnos[i].mostrarDades());
        }
    }

    public static void guardarPartida() throws IOException {

        // escritura de usuarios en el archivo
        FileOutputStream fos = new FileOutputStream(partidas);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (Alumno alumno : alumnos) {
            oos.writeObject(alumno);
        }

        for (Profesor profesor : profesores) {
            oos.writeObject(profesor);
        }

        oos.close();
    }

    public static void mostrarTodo() {
        System.out.println("Todas las personas:");

        for (int i = 0; i < profesoresCreados; i++) {
            System.out.println(profesores[i].mostrarDades());
        }
        for (int i = 0; i < alumnosCreados; i++) {
            System.out.println(alumnos[i].mostrarDades());
        }
    }
}
