package Ejercicios;
import java.util.Scanner;

public class ejercicio_06 {

	public static void rellenaMatriz(int mNum[][]) {
		for (int i = 0; i < mNum.length; i++) {
			for (int j = 0; j < mNum[i].length; j++) {
				mNum[i][j] = (int) (Math.random() * 9);
			}
		}
	}

	public static void muestraMatriz(int mAzar[][]) {
		for (int i = 0; i < mAzar.length; i++) {
			for (int j = 0; j < mAzar[i].length; j++) {
				System.out.print(mAzar[i][j] + " ");
			}

			System.out.println(" ");

		}
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int numeroFilas = 0, numeroColumnas = 0;

		System.out.println("Introduce número de filas:");
		numeroFilas = leer.nextInt();
		System.out.println("Introduce número de columnas:");
		numeroColumnas = leer.nextInt();

		int mNumeros[][] = new int[numeroFilas][numeroColumnas];

		rellenaMatriz(mNumeros);
		muestraMatriz(mNumeros);

	}

}
