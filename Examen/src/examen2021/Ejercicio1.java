package examen2021;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cuantas letras tiene tu nombre");
		int n = sc.nextInt();sc.nextLine();
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();
		String formato = "%-1s %-" + n + "s *\n";
		for (int i = 0; i < n + 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.printf(formato, "*", nombre, "*");
		
		for (int i = 0; i < n + 4; i++) {
			System.out.print("*");
		}
		sc.close();
	}
}
