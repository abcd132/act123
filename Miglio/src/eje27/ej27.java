package eje27;

import java.util.Scanner;

public class ej27 {

	public static void main(String[] args) {

		try (Scanner datos = new Scanner(System.in)) {
			int contraseña, intentos = 3;
			char decision;
			boolean quiero_salir = false;

			System.out.println("Ingrese la contraseña");
			contraseña = datos.nextInt();

			while (contraseña != 2006 && quiero_salir == false && intentos > 0 ) {

				System.out.println("Volve a intentarlo");
				intentos--;
				System.out.println("N° de intentos: " + intentos);
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
					contraseña = datos.nextInt();
				} else {
					System.out.println("Respuesta no valida. ");
					System.out.println("Ingresa otro numero: ");
					contraseña = datos.nextInt();
				}
			}

			if (quiero_salir == true) {
				System.out.println("Abandonaste. Cantidad de intentos: " + intentos);
			}

			if (contraseña == 2006) {
				System.out.println("Contraseña correcta " + "N° de intentos:" + intentos);

			}
		}
	}
}
