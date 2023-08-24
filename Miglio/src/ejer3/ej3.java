package ejer3;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
        int costo1=5500,costo2=5500;
		int costo = 5000, cant_remeras;
		char talle;

		System.out.println("1.Ingrese una letra entre S,M,L.");

		talle = datos.next().charAt(0);

		switch (talle) {

		case 'S':

			System.out.println("cuantas remeras desea comprar.\n");
			cant_remeras = datos.nextInt();

			if (cant_remeras > 30) {
				System.out.println("No hay stock.\n");

			}
			if (cant_remeras < 15) {
				System.out.println("No se le aplicara un descuento del 15 %" + talle);
			}

			else if (cant_remeras >= 15 || cant_remeras > 30) {
				cant_remeras = (int) (costo * 0.15);
				System.out.println("El costo total del descuento de 15% es de:" +cant_remeras);

			}

			break;
		
			
		case 'M':

			System.out.println("cuantas remeras desea comprar.\n");
			cant_remeras = datos.nextInt();

			if (cant_remeras < 40) {
				System.out.println("No hay stock.\n");

			}
			if (cant_remeras < 15) {
				System.out.println("No se le aplicara un descuento del 15 %" + talle);
			}

			else if (cant_remeras >= 22 || cant_remeras > 40) {
				cant_remeras = (int) (costo1 * 0.15);
				System.out.println("El costo total del descuento de 15% es de:" +cant_remeras);

			}
			break;
			

		case 'L':

			System.out.println("cuantas remeras desea comprar.\n");
			cant_remeras = datos.nextInt();

			if (cant_remeras > 50) {
				System.out.println("No hay stock.\n");

			}
			if (cant_remeras < 15) {
				System.out.println("No se le aplicara un descuento del 15 %" + talle);
			}

			else if (cant_remeras >= 35 || cant_remeras > 450) {
				cant_remeras = (int) (costo2 * 0.15);
				System.out.println("El costo total del descuento de 15% es de:" +cant_remeras);

			}
			
			
		
		}
	}
}
