package ej49;

import java.util.Iterator;
import java.util.Scanner;

public class eje49 {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		int[] dni = new int[4];

		for (int i = 0; i < dni.length; i++) {
			System.out.println("Ingrese el DNI:");
			dni[i] = datos.nextInt();
		}

		for (int i = 0; i < dni.length - 1; i++) {
			for (int j = 0; j < dni.length - i - 1; j++) {
				if (dni[j] > dni[j + 1]) {
					int temp = dni[j];
					dni[j] = dni[j + 1];
					dni[j + 1] = temp;

				}
			}
		}

		System.out.println("\nLista ordenada:");
		for (int A : dni) {
			System.out.print(A + " ");

		}
		for (int i = 0; i < dni.length - 1; i++) {
			for (int j = 0; j < dni.length - i - 1; j++) {
				if (dni[j] < dni[j + 1]) {
					int temp = dni[j];
					dni[j] = dni[j + 1];
					dni[j + 1] = temp;

				}
			}
		}

		System.out.println("\nLista desordenada:");
		for (int A : dni) {
			System.out.print(A + " ");

		}
	}
}
