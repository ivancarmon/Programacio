package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();

		while (A <= 0) {
			System.out.println("numero invalido");
			System.out.println("Repite el numero: ");
			A = sc.nextInt();
		}
		if (A > 0) {
			if(A % 2 == 0) {
				System.out.println("es par");
			}else {
				System.out.println("es impar");
			}
		}

	}
}
