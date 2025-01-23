package estructurasDeDatosDinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce un numero: ");
			numeros.add(sc.nextInt());
		}
		System.out.println(numeros);
		sc.close();
	}
}
