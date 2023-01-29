package ejercicio6_3;

import java.util.Scanner;

public class Generador {
	public static void main (String[] args) {

		Password passwd = new Password();

		int longi = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas contrasenyas quieres generar?");
		int amt = sc.nextInt();

		System.out.println("Quieres introducir un tamanyo? [Si = 1] [No = 2]");
		int intro = sc.nextInt();
		
		if (intro == 1) {
			System.out.println("Introduce un tamanyo:");
			longi = sc.nextInt();
			Password.longitud = longi;
		}

		else {
			Password.longitud = 8;
		}

		for (int i = 0; i < amt; i++) {
			Password.generarPassword(passwd);
			Password.comprovar(passwd);
		}

		sc.close();
	}
}