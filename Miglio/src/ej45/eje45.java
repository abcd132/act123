package ej45;

import java.util.Scanner;

public class eje45 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		String[] nomsoc1 = new String[8];

		int[] numsoc1 = new int[8];

		String[] nomsoc = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };

		int[] numsoc = { 1011, 2367, 9121, 8748, 1817, 6423, 2034 };

		int ind = 7;
		int numero1 = numsoc[0];
		String nombre1 = nomsoc[0];
		int numero2 = numsoc[1];
		String nombre2 = nomsoc[1];
		int numero3 = numsoc[2];
		String nombre3 = nomsoc[2];
		int numero4 = numsoc[3];
		String nombre4 = nomsoc[3];
		int numero5 = numsoc[4];
		String nombre5 = nomsoc[4];
		int numero6 = numsoc[5];
		String nombre6 = nomsoc[5];
		int numero7 = numsoc[6];
		String nombre7 = nomsoc[6];

		System.out.println("Ingrese el numero de socio");
		int nombre = datos.nextInt();

		if (nombre == 0) {

			System.out.println("El nombre " + nombre1 + " está asociado al numero " + numero1);
		}

		if (nombre == 1) {

			System.out.println("El nombre " + nombre2 + " está asociado al numero " + numero2);
		}

		if (nombre == 2) {

			System.out.println("El nombre " + nombre3 + " está asociado al numero " + numero4);
		}

		if (nombre == 3) {

			System.out.println("El nombre " + nombre5 + " está asociado al numero " + numero5);
		}

		if (nombre == 4) {

			System.out.println("El nombre " + nombre6 + " está asociado al numero " + numero6);
		}

		if (nombre == 5) {

			System.out.println("El nombre " + nombre7 + " está asociado al numero " + numero7);
		}

	}

}
