package examen2021;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int column;
		String continuar = "";
		do {
			do {
				System.out.println("Dime el número de columnas: (4 - 10 - 20 - 25)");
				column = sc.nextInt();sc.nextLine();
			}while(column != 4 && column != 10 && column != 20 && column != 25);
			for (int i = 1; i <= 100; i++) {
				System.out.printf("%4d", i);
				if(i % column == 0) {
					System.out.println();
				}
			}
			System.out.println("¿Desea continuar? (s/n)");
			continuar = sc.nextLine();
		} while (continuar.equalsIgnoreCase("s"));
		sc.close();
	}
}