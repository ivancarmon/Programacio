package condicionals;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		if (edad < 32) {
			System.out.println("SI");
			
		}
		else {
			System.out.println("NO");
		}
		
	}
}
