package ejercicio13;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		char remera;

		System.out.println("Ingrese el talle de la remera: ");

		remera = datos.next().charAt(0);

		if (remera=='S') {
			System.out.println(" quedan 5 remeras.\n");
		}

		if (remera=='M') {
			System.out.println(" quedan 2 remeras.\n");
		}

		if (remera=='L') {
			System.out.println("no quedan remeras.\n");
			
		
		}

	}

}
