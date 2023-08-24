package e6;

import java.util.Scanner;

public class ejer6 {
	public static void main(String[] args) {

		double nota1;
		float redondeo = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese nota del 1-10:");
		nota1 = (float) entrada.nextFloat();

		double nota = Math.floor(redondeo);

		System.out.println("El redondeo de la nota es: " + Math.round(nota1));

	}

}
