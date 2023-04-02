import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println("Introduzca el color que desea buscar:");
        String colorInput = sc.nextLine();

        for (int i = 0; i < colores.size(); i++) {
            if (colores.get(i) == colorInput) {
                System.out.println("Color encontrado.");
            }
            else {
                System.out.println("Color no encontrado.");
            }
        }

        /*Ordenar un array list. */
        ArrayList <Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(8);
        numeros.add(5);
        numeros.add(3);
        numeros.add(10);
        numeros.add(7);

        System.out.println("ArrayList de numeros sin ordenar: " + numeros);

        numeros.sort(null);

        System.out.println("ArrayList de numeros ordenada: " + numeros);

        /*Copiar un ArrayList en otro y cambiar de posicion un ArrayList. */

        ArrayList <Integer> numerosv2 = (ArrayList<Integer>)numeros.clone();

        System.out.println("ArrayList numeros 2 clonado del de numeros: " + numerosv2);

        System.out.println("--------");

        System.out.println("ArrayList de numeros barrejat: " + numerosv2);

        /*Invertir los elementos de una arrayList */
        Collections.reverse(numeros);
        System.out.println(numeros);

        /*Extraer una parte de una ArrayList */
        String hola = numeros.subList(0, 2).toString();

        /*Comparar dos ArrayList. */
        for (int i = 0; i < numerosv2.size(); i++) {
            if (numeros.get(i).equals(numerosv2.get(i))) {
                System.out.println("Los dos números son iguales.");
            }
            else {
                System.out.println("Los elementos no son iguales.");
            }
        } 

        /*Intercambiar dos elementos en un arrayList. */
        Collections.swap(numerosv2, 1, 4);

        /*Unir dos arrayList */
        numeros.addAll(numerosv2);

        System.out.println("ArrayList unida: " + numeros);

        /*Clonar una arrayList en otra */
        ArrayList<Integer> copia = (ArrayList<Integer>)numerosv2.clone();
        // Manera correcta: ArrayList<Integer> copia = new ArrayList<>(numerosv2);

        System.out.println(copia);

        /*Buidar un ArrayList */
        numerosv2.clear();

        /*Comprobar si una ArrayList está vacia o no. */
        if (numerosv2.isEmpty()) {
            System.out.println("El arrayList está vacio.");
        }
        else {
            System.out.println("El arrayList tiene contenido.");
        }

        /* Reducir la capacidad del ArryList a la mitad. */
        numeros.subList(0, (numeros.size() / 2));

        /*Aumentar el tamaño de un ArrayList. */
        numeros.ensureCapacity(30);

        /*Sustituir el segundo elemento de un ArrayList por en elemento especificado. */
        numeros.set(2, 56);

        /*Imprimir todos los elementos usando las posiciones. */
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }














        





    }

}
