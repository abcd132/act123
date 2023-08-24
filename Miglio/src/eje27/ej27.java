package eje27;

import java.util.Scanner;

public class ej27 {

	public static void main(String[] args) {

		try (Scanner datos = new Scanner(System.in)) {
			int contrase�a, intentos = 3;
			char decision;
			boolean quiero_salir = false;

			System.out.println("Ingrese la contrase�a");
			contrase�a = datos.nextInt();

			while (contrase�a != 2006 && quiero_salir == false && intentos > 0 ) {

				System.out.println("Volve a intentarlo");
				intentos--;
				System.out.println("N� de intentos: " + intentos);
				System.out.println("");

				System.out.println("Desea abandonar? (S/N)");
				decision = datos.next().charAt(0);

				if (intentos == 0) {
					System.out.println("Se llego al limite de intentos:" + intentos);
				}
				if (decision == 'S') {
					quiero_salir = true;
				} else if (decision == 'N') {
					System.out.println("Ingresa otro numero: ");
					contrase�a = datos.nextInt();
				} else {
					System.out.println("Respuesta no valida. ");
					System.out.println("Ingresa otro numero: ");
					contrase�a = datos.nextInt();
				}
			}

			if (quiero_salir == true) {
				System.out.println("Abandonaste. Cantidad de intentos: " + intentos);
			}

			if (contrase�a == 2006) {
				System.out.println("Contrase�a correcta " + "N� de intentos:" + intentos);

			}
		}
	}
}
