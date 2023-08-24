package jaba;

import java.util.Scanner;

public class jaba {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			int edad1 = 0;
			int edad2 = 0;
			String nombre1 = null;
			String nombre2 = null;
			System.out.println("Escriba el nombre 1: " + nombre1);
			nombre1 = entrada.next();

			System.out.println("Escriba el nombre 2:" + nombre2);
			nombre2 = entrada.next();

			System.out.println("Escriba la edad:" + edad1);
			edad1 = entrada.nextInt();

			System.out.println("Escriba la edad:" + edad2);
			edad2 = entrada.nextInt();

			String nombre = null;
			System.out.println("Tu nombre es: " + nombre1);
			System.out.println("Tu edad es: " + edad1);

			System.out.println("Tu nombre es: " + nombre2);
			System.out.println("Tu edad es: " + edad2);
		}

	}

}
