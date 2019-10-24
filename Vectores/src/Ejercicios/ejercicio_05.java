package Ejercicios;
import java.util.Scanner;

public class ejercicio_05 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int numeroFilas = 0;

		System.out.println("Introduzca número de filas de la matriz:");
		numeroFilas = leer.nextInt();

		String mPersonas[][] = new String[numeroFilas][2];

		for (int i = 0; i < mPersonas.length; i++) {
			leer = new Scanner(System.in);
			System.out.println("Introduzca nombre en posición " + (i + 1));
			mPersonas[i][0] = leer.nextLine();
			System.out.println("Introduzca edad en posición " + (i + 1));
			mPersonas[i][1] = leer.nextLine();
		}

		for (int i = 0; i < mPersonas.length; i++) {

			System.out.print(mPersonas[i][0] + " - ");
			System.out.println(mPersonas[i][1]);
		}

	}

}
