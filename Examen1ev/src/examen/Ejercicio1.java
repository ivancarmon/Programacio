package examen;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		char c;
		
		System.out.println("Introduce un simbolo: ");
		c = sc.next().charAt(0);
		System.out.println("Introduce el tamaño: ");
		n = sc.nextInt();
		System.out.print("\033[32m");
		imprimir69(n, c);
		
		
		sc.close();
	}
	public static void imprimirPrimeraLinea(int n, char c) {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
		System.out.print("  ");
		for (int i = 0; i < n; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
		
	public static void imprimirLineasCentrales1(int n, char c) {
		int y = n + 2;
		int z = n-1;
		String formato = "%-" + y + "s%-" + z+ "s" + c +"%n";
		int x = (n - 3)/2;
		for (int i = 0; i < x; i++) {
			System.out.printf(formato, c,c);
		}
		
	}
	public static void imprimirLineasCentrales2(int n, char c) {
		int y = n + 2;
		int z = n-1;
		String formato = "%-" + z + "s%-" + y+ "s" + c +"%n";
		int x = (n - 3)/2;
		for (int i = 0; i < x; i++) {
			System.out.printf(formato, c,c);
		}
	}
	public static void imprimir69(int n,char c) {
		imprimirPrimeraLinea(n,c);
		imprimirLineasCentrales1(n,c);
		imprimirPrimeraLinea(n,c);
		imprimirLineasCentrales2(n,c);
		imprimirPrimeraLinea(n,c);
	}

		
	
}
