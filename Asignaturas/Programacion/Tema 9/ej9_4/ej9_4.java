import java.util.LinkedList;

/*
* Practica de manipulación de datos con LinkedList.
*/

public class ej9_4 {
    public static void main(String[] args) {
        
        /* Crear un LinkedList y llenarla de colores. */
        LinkedList<String> colores = new LinkedList<String>();

        colores.add(0, "Rojo");
        colores.add(1, "Azul");
        colores.add(2, "Verde");
        colores.add(3, "Cyan");
        colores.add(4, "Amarillo");

        /*Añadir un elemento especificado al final de la LinkedList. */
        colores.add("Slatt");

        System.out.println(colores);

        /*Recorre todos los elementos de un LinkedList. */
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        /*Recorre todos los elementos de un LinkedList desde una posición
        * indicada.
        */
        for (int i = 2; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }

        /*Iterar un LinkedList en orden inverso. */
        for (int i = colores.size(); i <= 0; i--) {
            System.out.println(colores.get(i));
        }

        /*Insertar un elemento especificado en una posición especificada. */
        colores.set(3, "Negro");

        /*Insertar un elemento en la primera posición y otro
        * en la última posición de la LinkedList.
        */
        colores.set(0, "Hola");
        colores.set(colores.size() - 1, "Adios");

        /*Insertar un elemento al principio de una LinkedList y
         * otro al final de este.
         */
        colores.addFirst("Primer");
        colores.addLast("Ultimo");

        /*Insertar algunos elementos es la posición especificada. */
        colores.set(1, "Verde Oscuro");
        colores.set(2, "Blanco");
        colores.set(3, "Lima");

        /*Obtener la primera y última ocurrencia de un elemento especificado. */
        





        

    }
}
