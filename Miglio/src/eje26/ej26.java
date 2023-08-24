package eje26;

import java.util.Scanner;

public class ej26 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int intentos = 3;
		int contraseña;

		System.out.println("Ingrese su contraseña");
		contraseña = datos.nextInt();

		intentos++;

		while (contraseña != 2006 && intentos > 0) {
			System.out.println("Contraseña incorrecta volve a intentarlo");
			contraseña = datos.nextInt();
			intentos--;
			System.out.println("N° de intentos: " + intentos);

			 if (intentos == 0) {
				System.out.println("Se llego al limite de intentos" + intentos);
			}

		}

		System.out.println("contraseña correcta");

	}
}
