package Recuperatorio;

import java.util.Scanner;

public class recu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float sueldos, min = -100000, max = 100000;

		int num1 = 0;

		for (int i = 0; i <= 4; i++) {

			System.out.println("Ingrese un numero de cinco cifras");
			num1 = entrada.nextInt();

		}

		System.out.println("Apellido del primer empleado:");
		char ape1 = entrada.next().charAt(0);

		System.out.println("Apellido del segundo empleado:");
		char ape2 = entrada.next().charAt(0);

		System.out.println("Apellido del tercer empleado:");
		char ape3 = entrada.next().charAt(0);

		System.out.println("Apellido del cuarto empleado:");
		char ape4 = entrada.next().charAt(0);

		for (int i = 0; i <= 4; i++) {

			System.out.println("Sueldo del empleado:");
			int sueldo = entrada.nextInt();

			sueldos = entrada.nextFloat();
			if (sueldo > max) {
				max = sueldos;
			}

			if (sueldo < min) {

				min = sueldos;
			}
		}

		System.out.println("apellido:" + ape1 + "numero:  " + num1 + "sueldo:");
		System.out.println("apellido:" + ape2 + "numero:  " + num1 + "sueldo:");
		System.out.println("apellido:" + ape3 + "numero:  " + num1 + "sueldo:");
		System.out.println("apellido:" + ape4 + "numero:  " + num1 + "sueldo:");

		System.out.println("El sueldo minimo es: " + min);
		System.out.println("El sueldo maximo es: " + max);

	}

}
