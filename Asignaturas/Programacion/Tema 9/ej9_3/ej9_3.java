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

        System.out.println("ArrayList de numeros barrejat: " + );



        





    }

}
