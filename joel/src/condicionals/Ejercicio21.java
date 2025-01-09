package condicionals;

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int decada = A % 100;
		if (decada >= 90 && decada < 100 ) {
			System.out.println("SI");
		}
		else {
			System.out.println("NO");
		}
	}
}
