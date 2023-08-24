package ejswitch19;

import java.util.Scanner;

public class switch19 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int cafe;

		System.out.println("Ingrese el tipo de Cafe:");

		cafe = datos.nextInt();

		switch (cafe) {

		case 1:
			System.out.println("Es cafe cortado");
			break;

		case 2:
			System.out.println("Es cafe latte");
			break;

		case 3:
			System.out.println("Es cafe solo");
			break;

		case 4:
			System.out.println("Es cafe lagrima");
			break;

		}

		System.out.println("Hasta la proxima");
	}

}
