package Ejercicios;
import java.util.Scanner;

public class ejercicio_04 {

	public static void muestraContenido(String vNom[], int vEd[]) {
		for (int i = 0; i < vNom.length; i++) {
			System.out.println(vNom[i]);
			System.out.println(vEd[i]);
		}
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int dimensionVector = 0;

		System.out.println("Introduzca el tamaño de los vectores:");
		dimensionVector = leer.nextInt();

		String vNombres[] = new String[dimensionVector];
		int vEdades[] = new int[dimensionVector];

		for (int i = 0; i < vNombres.length; i++) {
			System.out.println("Introduzca nombre en posición " + (i + 1));
			vNombres[i] = leer.next();

			System.out.println("Introduzca edad en posición " + (i + 1));
			vEdades[i] = leer.nextInt();
		}

		muestraContenido(vNombres, vEdades);

	}

}
