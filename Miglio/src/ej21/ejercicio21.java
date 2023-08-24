package ej21;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int temperatura = 35;

		do {
			System.out.println("Temperatura: " + temperatura);

			temperatura++;

			temperatura += 1;

		}

		while (temperatura <= 100);
		System.out.println("100 Valor extremo apagando la PC" + temperatura);
	
		if (temperatura == 85) {
			
		System.out.println("¡Cuidado!, temperatura peligrosa 85" + temperatura);
		}
	}

}



