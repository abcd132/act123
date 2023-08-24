package tp_1er_bim;

import java.util.Scanner;

public class tp_1er_bim {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int opc;
		
		System.out.println("\tEste programa te permite resolver algunos problemas");
		System.out.println ("\t Eliga una opcion:");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo \n");

		opc = datos.nextInt();

		switch (opc) {

		case '1':
			System.out.println("Ingresa un numero para calcular su raiz cuadrada: ");

			float num_raiz;
			num_raiz = datos.nextFloat();

			if (num_raiz >= 0) {
				float raiz_cuadrada = (float) Math.sqrt(0);
				System.out.println("El resultado es: " + raiz_cuadrada);
			}
			 else {
				System.out.println("No se puede calcular la raiz de un negativo.");
			}

			
		case '2':
			System.out.println("Ingresa un numero: ");

			int num_signo;
			num_signo = datos.nextInt();

			if (num_signo == 0) {
				System.out.println("El numero es cero");
			}  if (num_signo > 0) {
				System.out.println("El numero es positivo");
			} if (num_signo < 0   ) {
				System.out.println("El numero es negativo");
			}

			break;

		case '3':
			System.out.println("Ingresa un numero entre 0 y 9");

		
			num_signo = datos.nextInt();
			
			
			double num_bingo = (double) Math.random() * 9;
			int num_ganador = (int) num_ganador;

			if (num_bingo == num_ganador) {
				System.out.println("Ganaste!");
			} else {
				System.out.println("Perdiste :(");
				System.out.println("El numero ganador es: " + + Math.round(num_ganador));
			}

			

		default:
			System.out.println("Opcion incorrecta.");
			break;

			}
		}
}
