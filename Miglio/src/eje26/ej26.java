package eje26;

import java.util.Scanner;

public class ej26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int intentos = 3;
		int contrase�a;

		System.out.println("Ingrese su contrase�a");
		contrase�a = datos.nextInt();

		intentos++;

		while (contrase�a != 2006 && intentos > 0) {
			System.out.println("Contrase�a incorrecta volve a intentarlo");
			contrase�a = datos.nextInt();
			intentos--;
			System.out.println("N� de intentos: " + intentos);

			 if (intentos == 0) {
				System.out.println("Se llego al limite de intentos" + intentos);
			}

		}

		System.out.println("contrase�a correcta");

	}
}
