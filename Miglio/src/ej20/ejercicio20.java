package ej20;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String args[]) throws InterruptedException {
		
			Scanner datos = new Scanner(System.in);
			int num_jugadores = 1;

			while (num_jugadores <= 100) {
				System.out.println("Nuevo seguidor: " + num_jugadores);
				Thread.sleep(2000);
				
			
				num_jugadores++; 
									 
				
				  num_jugadores +=1;
				
			}

			System.out.println("Felicidades Llegaste a los 100 seguidores.");

		}
}


