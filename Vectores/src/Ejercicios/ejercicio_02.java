package Ejercicios;
import java.util.Scanner;

public class ejercicio_02 {

	public static double devuelveMedia(int vNum[]) {
		Scanner leer = new Scanner(System.in);
		double solucion = 0;

		for (int i = 0; i < vNum.length; i++) {
			System.out.println("Introduce valor en la posición " + i);
			vNum[i] = leer.nextInt();
			solucion = solucion + vNum[i];
		}

		return solucion;
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int vNumeros[] = new int[10];

		System.out.println(devuelveMedia(vNumeros) / 10);

	}

}
