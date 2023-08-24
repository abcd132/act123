package eje41;

import java.util.Iterator;
import java.util.Scanner;

public class ej41 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		String[] nombre = new String[11];
		String[] nombres = { "Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito",
				"Leybovich", "Raffo", };

		for (String nombre1 : nombres) {
			System.out.println(nombre1);
		}
	}

}
