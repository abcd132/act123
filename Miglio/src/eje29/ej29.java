package eje29;

import java.util.Iterator;
import java.util.Scanner;

public class ej29 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		
		for (int i = 100; i >= 0; i--) {
			System.out.println("Porcentaje de Bateria:" + i);
			Thread.sleep(50);

			
			
			if (i == 20) {
				System.out.println("Bateria Baja:" + i);

				Thread.sleep(1000);

			}

		}

	}
}