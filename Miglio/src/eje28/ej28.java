package eje28;

import java.util.Scanner;

public class ej28 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		int Porcentaje = 100;

		while (Porcentaje <= 100 && Porcentaje > 0) {
			System.out.println("Porcentaje de Bateria:" + Porcentaje);
			Thread.sleep(50);

			Porcentaje--;

		}

		if (Porcentaje == 20) {
			System.out.println("Bateria Baja:" + Porcentaje);

		}

	}

}
