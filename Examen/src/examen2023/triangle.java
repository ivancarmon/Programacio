package examen2023;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduze caso: ");
		int caso = sc.nextInt();
		System.out.println("introduce tamaño: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
		
		
	}
}
