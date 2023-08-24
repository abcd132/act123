package ej52;

import java.util.Scanner;

public class eje52 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int num;
		int[][] matriz = new int[2][2];

		matriz[0][0] = 1;
		matriz[0][1] = 2;

		matriz[1][0] = 3;
		matriz[1][1] = -4;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}

		}

		if (matriz[0][0] == -1 || matriz[0][1] == -2 || matriz[1][0] == -3 || matriz[1][1] == -4) {

			System.out.println("Ingrese un nuevo numero:");
			num = datos.nextInt();

		}
		

		System.out.println("");
	}
}
