package ej50;

import java.util.Scanner;

public class eje50 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int[] est = new int[4];
		float apues, apumax = -90000, apumin = 90000;

		for (int i = 0; i < est.length; i++) {
			System.out.println("Cuanto dinero desea apostar");
			apues = datos.nextFloat();
			est[i] = (int) apues;

			if (apues < 500) {
				System.out.println("El valor ingresado es menor a 500 ");

				i--;
			}

			if (apues > apumax) {
				apumax = apues;
			}

			if (apues < apumin) {
				apumin = apues;
			}
		}
		System.out.println("La apuesta minima es: " + apumin);
		System.out.println("La apuesta máxima es: " + apumax);

		for (int i = 0; i < est.length - 1; i++) {
			for (int j = 0; j < est.length - i - 1; j++) {
				if (est[j] > est[j + 1]) {
					int temp = est[j];
					est[j] = est[j + 1];
					est[j + 1] = temp;
				}
			}
		}
		System.out.println("\nLista ordenada:");
		for (int A : est) {
			System.out.print(A + " ");
		}
	}
}
