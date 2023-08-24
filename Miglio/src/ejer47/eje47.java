package ejer47;

import java.util.Scanner;
import java.util.Arrays;

public class eje47 {

	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);

		int[] nota = new int[5];
		int length = nota.length;
		int[] k = nota.clone();
		Arrays.sort(k);

		for (int i = 0; i < nota.length; i++) {

			System.out.println("ingrese la nota del alumno");
			nota[i] = datos.nextInt();

		}

		for (int i = 0; i <= 4; i++) {

			System.out.println("Notas ordenadas: " + nota[i]);
		}

		for (int numero : k) {
			System.out.println(numero);

		}
	}

}