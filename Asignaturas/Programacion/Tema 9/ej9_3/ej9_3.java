import java.util.ArrayList;
import java.util.Scanner;

public class ej9_3 {
    
    public static void main(String[] args) {
        
        /* Crear un ArrayList, poner colores e imprimir
        la colección. */
        ArrayList<String> colores = new ArrayList<>();

        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Azul");

        System.out.println("Colores" + colores);

        /*Iterar para todos los elementos. */
        for (int i = 0; i < colores.size(); i++) {
            System.out.println("Color " + i + ": " + colores.get(i));
        }

        /*Insertar un elemento en la primera posición. */
        colores.add(0, "Cyan");

        System.out.println(colores);

        /*Recuperar un element...*/
        System.out.println("Introduce la posicion que quiera obtener de la array list:");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        System.out.println(colores.get(pos));

        /*Actualizar un element de matriu específic... */
        System.out.println("Que color deseas anadir?");
        String input = sc.nextLine();
        System.out.println("En que posicion lo quieres poner?");
        pos = sc.nextInt();
        colores.set(pos, input);

        /*Eliminar el tercer element d'una arrayList */
        colores.remove(2);

        /*Cercar un element en una arrayList */
        



    }

}
