package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			float A�OS = 0;
			float SEMANAS = 0;
			float totalsemanas, totala�os, totalmeses, semanas = 0, a�os = 0, meses = 0;

			System.out.println("\t Ingrese la cantidad de SEMANAS:");
			semanas = entrada.nextFloat();

			System.out.println("\t Ingrese la cantidad de MESES:");
			meses = entrada.nextFloat();

			System.out.println("\t Ingrese la cantidad de A�OS:");
			a�os = entrada.nextFloat();

			totalsemanas = semanas * 7;
			totala�os = a�os * 365;
			totalmeses = meses * 30;

			System.out.println("La cantidad en Dias son: ");
			System.out.println(" SEMANAS: " + totalsemanas);
			System.out.println(" MESES: " + totalmeses);
			System.out.println(" A�OS: " + totala�os);

		}

	}

}
