package opermath;

import java.util.Scanner;

public class opermath {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		float num1, num2, num3, num4, suma, suma1, resta, resta1, multip, multip1, div, div1, resto, resto1;

		System.out.println("\tOperaciones matematicas");
		System.out.println("Escriba­ un numero: ");
		num1 = entrada.nextFloat();
		System.out.println("Escriba­ otro numero: ");
		num2 = entrada.nextFloat();
		System.out.println("Escriba­ un numero: ");
		num3 = entrada.nextFloat();
		System.out.println("Escriba­ un numero: ");
		num4 = entrada.nextFloat();

		System.out.println("Los resultados, son: ");

		suma = num1 + num2;
		resta = num1 - num2;
		multip = num1 * num2;
		div = num1 / num2;
		resto = num1 % num2;

		suma1 = num3 + num4;
		resta1 = num3 - num4;
		multip1 = num3 * num4;
		div1 = num3 / num4;
		resto1 = num3 % num4;

		System.out.println("Resultado de la suma:" + suma);
		System.out.println("Resultado de la resta:" + resta);
		System.out.println("Resultado de la multiplicacion:" + multip);
		System.out.println("Resultado de la division:" + div);
		System.out.println("El resto de la division es: " + resto);

		System.out.println("Resultado de la suma:" + suma1);
		System.out.println("Resultado de la resta:" + resta1);
		System.out.println("Resultado de la multiplicacion:" + multip1);
		System.out.println("Resultado de la division:" + div1);
		System.out.println("El resto de la division es: " + resto1);

	}
}
