package Ejercicios;
import java.util.Scanner;

public class ejercicio_03 {

	public static int rellenaVector(int vNum[], int dimension) {
		Scanner leer = new Scanner(System.in);
		int multiplo = 0;

		System.out.println("Introduzca número:");
		multiplo = leer.nextInt();

		for (int i = 0; i < vNum.length; i++) {
			vNum[i] = multiplo * (i+1);
		}

		for (int i = 0; i < vNum.length; i++) {
			System.out.println(vNum[i]);
		}

		return multiplo;
	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int dimensionVector = 0;
		
		System.out.println("Indique tamaño del vector:");
		dimensionVector = leer.nextInt();
		
		int vNumeros[] = new int[dimensionVector];

		rellenaVector(vNumeros, dimensionVector);

	}

}
