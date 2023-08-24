package eje39;

import java.util.Scanner;

public class ej39 {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String[11];

		int[] edad = new int[11];

		for (int i = 0; i < 11; i++) {

			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();

			System.out.println("Ingresa la edad correspondiente: ");
			edad[i] = datos.nextInt();

		}

		System.out.println("\n ");

		System.out.println("Edad del primero:" + edad[0]);
		System.out.println("Edad del segundo:" + edad[1]);
		System.out.println("Edad del tercero:" + edad[2]);
		System.out.println("Edad del cuarto:" + edad[3]);
		System.out.println("Edad del quinto:" + edad[4]);
		System.out.println("Edad del sexto:" + edad[5]);
		System.out.println("Edad del septimo:" + edad[6]);
		System.out.println("Edad del octavo:" + edad[7]);
		System.out.println("Edad del noveno:" + edad[8]);
		System.out.println("Edad del decimo:" + edad[9]);
		System.out.println("Edad del onceavo:" + edad[10]);

		System.out.println("\n ");

		for (int i = 0; i < 11; i++) {

			System.out.println("Nombre del jugador " + i + ": ");
			System.out.println(nombre[i]);

		}
	}
}
