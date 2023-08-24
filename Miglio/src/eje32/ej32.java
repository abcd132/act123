package eje32;

import java.util.Scanner;

public class ej32 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		int mult, cantidad, resultado;

		System.out.println("Ingrese el numero que desea multiplicar");
		mult = datos.nextInt();

		System.out.println("Hasta que valor deseas la tabla? ");
		cantidad = datos.nextInt();

		for (int i = 0; i <= cantidad; i++) {
			resultado = mult * i;
			System.out.println(mult + " * " + i + " = " + resultado);

		}

	}
}
