package ej12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int nota;

		System.out.println("Ingrese una nota del 1-10: ");

		nota = entrada.nextInt();

		if (nota >= 1 && nota <= 3) {
			System.out.println(" Insuficiente\n");
		}

		if (nota < 6) {
			System.out.println(" No logrado\n");
		}
		
		if (nota == 7 || nota ==6   ) {
			System.out.println(" Suficiente\n");
		}
		if (nota == 8 || nota==9   ) {
			System.out.println(" Notable\n");
		}
		if (nota == 10) {
			System.out.println(" Sobresaliente\n");
		}
		
		

	}

}
