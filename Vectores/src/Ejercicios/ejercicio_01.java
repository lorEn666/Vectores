package Ejercicios;
import java.util.Scanner;

public class ejercicio_01 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int vNumeros[] = new int[10];
		int media = 0;

		for (int i = 0; i < vNumeros.length; i++) {
			System.out.println("Introduce valor en posición " + i);
			vNumeros[i] = leer.nextInt();
			media = media + vNumeros[i];
		}

		System.out.println("La media es " + (media / 10));

	}

}
