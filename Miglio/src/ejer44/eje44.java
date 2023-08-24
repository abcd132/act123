package ejer44;

import java.util.Iterator;
import java.util.Scanner;

public class eje44 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int numpar, numero, numero2, numero3, numero4;

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese un dni:");
			numpar = datos.nextInt();

			if (numpar % 2 == 1) {
				System.out.println("El numero:"+ numpar + "\tes impar");
			}

		}

	}

}
