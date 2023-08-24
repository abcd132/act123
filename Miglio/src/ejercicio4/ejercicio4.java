package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			float AÑOS = 0;
			float SEMANAS = 0;
			float totalsemanas, totalaños, totalmeses, semanas = 0, años = 0, meses = 0;

			System.out.println("\t Ingrese la cantidad de SEMANAS:");
			semanas = entrada.nextFloat();

			System.out.println("\t Ingrese la cantidad de MESES:");
			meses = entrada.nextFloat();

			System.out.println("\t Ingrese la cantidad de AÑOS:");
			años = entrada.nextFloat();

			totalsemanas = semanas * 7;
			totalaños = años * 365;
			totalmeses = meses * 30;

			System.out.println("La cantidad en Dias son: ");
			System.out.println(" SEMANAS: " + totalsemanas);
			System.out.println(" MESES: " + totalmeses);
			System.out.println(" AÑOS: " + totalaños);

		}

	}

}
