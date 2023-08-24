package eje30;

import java.util.Iterator;
import java.util.Scanner;

public class ej30 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		for (int i = 0; i <= 100; i++) {

			System.out.println("Cantidad de Seguidores:" + i);
			Thread.sleep(5);

			if (i == 100) {
				System.out.println("Alcanzaste la meta de seguidores:" + i);
			}

		}

	}

}
