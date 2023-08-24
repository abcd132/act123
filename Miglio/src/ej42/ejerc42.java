package ej42;

import java.util.Scanner;

public class ejerc42 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		System.out.println("Ingrese un numero entre 0 y 50");

		System.out.println("Ingresa el primer número: ");
		int numero1 = datos.nextInt();

		System.out.println("Ingresa el segundo número: ");
		int numero2 = datos.nextInt();

		System.out.println("Ingresa el tercer número: ");
		int numero3 = datos.nextInt();

		double numero = Math.floor(numero1);
		int numeroAleatorio = (int) (Math.random() * 51);

		if (numero1 == numeroAleatorio || numero2 == numeroAleatorio || numero3 == numeroAleatorio) {
			System.out.println("¡Ganaste! El número aleatorio era " + numeroAleatorio);

		} else {
			System.out.println("Perdiste. El número aleatorio era " + numeroAleatorio);
		}
	}
}
