package eje33;

import java.util.Scanner;

public class ej33 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char nomb;
		int edad;

		for (int i = 0; i <= 10; i++) {

			System.out.println("Nombre del Jugador:");
			nomb = datos.next().charAt(0);

			System.out.println("Edad del Jugador:");
			edad = datos.nextInt();

			System.out.println("\n Datos del jugador");

			System.out.println("Nombre del Jugador:" + nomb);
			System.out.println("Edad del Jugador:" + edad);

		}

	}

}
