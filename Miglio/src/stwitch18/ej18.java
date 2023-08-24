package stwitch18;

import java.util.Scanner;

public class ej18 {

	
	public static void main(String[] args) {
		 Scanner datos = new Scanner(System.in); 

			char remeras;

			System.out.println("Ingrese el talle de la remera:");

			remeras = datos.next().charAt(0);
			
			
			switch (remeras) {
			
			case 's':
				System.out.println("Quedan 5 remeras");
				break;

			case 'm':
				System.out.println("Quedan 2 remeras");
				break;

			case 'l':
				System.out.println("No quedan remeras");
				break;

				
			default:
				System.out.println("No Quedan remeras");
				break;

			}
	

		System.out.println("Hasta la proxima");
	}
}
