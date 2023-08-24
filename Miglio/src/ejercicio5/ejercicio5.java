package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		float numero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero positivo: ");

		numero = entrada.nextFloat();

		float raizcuadrada = (float) Math.sqrt(numero);
		int raizcuadrada2 = (int) Math.sqrt(numero);

		System.out.println("El nmero al cuadrado es : " + raizcuadrada);
	}

}
