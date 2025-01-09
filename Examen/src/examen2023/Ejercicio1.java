package examen2023;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el número de participantes en la carrera: ");
		int lineas = sc.nextInt();sc.nextLine();
		System.out.print("Dime el nombre de la ganadora: ");
		String nombre = sc.nextLine();
		System.out.print("Dime la línea de salida de la ganadora: ");
		int n = sc.nextInt();
		
		System.out.println("\nSALIDA");
		for (int i = 0; i < lineas; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i <= lineas; i++) {
			String formato = "%" + i + "s"; 
			System.out.printf(formato, "*");
			if (i == n) {
				System.out.print(" " + nombre);
			}
			System.out.println();
		}
		
		
	}
}
