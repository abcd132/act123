package ej8;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {

		float num;
		float redondeo = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero con dos decimales:");
		num = (float) entrada.nextFloat();

		int raizcuadrada = (int) Math.sqrt(num);
		int raizcuadrada2 = (int) Math.sqrt(num);

		
		System.out.println(" numero raiz: " + raizcuadrada+(Math.random() * 10 + 1 ));

	}

}
