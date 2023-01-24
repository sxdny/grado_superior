package ejercicio6_4;

import java.util.Scanner;

public class crearData {
    public static void main (String[] args) {

        int anyo, mes, dia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un dia, un mes y un anyo.");

        dia  = sc.nextInt();
        mes  = sc.nextInt();
        anyo = sc.nextInt();

        if (dia > 31 || mes > 12) {
            System.out.println("La data que ha introducido no es valida.");
        }
        else {
            Data data = new Data(dia, mes, anyo);
            System.out.println("Data:");
            System.out.println(data.dia + "-" + data.mes + "-" + data.anyo);

            Data.dema(data);
            
        }



        sc.close();

    }
}
