package funcions;

import java.util.Scanner;

public class Imprimir89 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char simbolo;
		int n;
		System.out.println("introduce el simbolo: ");
		String s = sc.nextLine();
		simbolo = s.charAt(0);
		do {
			System.out.println("introduce el tamaño: ");
			n = sc.nextInt();
		} while (n < 5 && n % 2 == 0);
		primeraLinea(n,simbolo);
		lineasCentrales1(n, simbolo);
		primeraLinea(n, simbolo);
		lineasCentrales2(n, simbolo);
		base(n, simbolo);
		
		
		sc.close();
	}
	public static void primeraLinea(int n, char simbolo) {
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(simbolo);
			
		}
		System.out.print("  ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}
	public static void lineasCentrales1(int n, char simbolo) {
		int x = (n - 3)/2;
		int y = n -1;
		String formato = "%-" + y + "s"+ simbolo + "  " + "%-" + y + "s"+ simbolo + "%n";
		for (int i = 0; i < x; i++) {
			System.out.printf(formato,simbolo,simbolo);
		}

		
		
		
	}
	public static void lineasCentrales2(int n,char simbolo) {
		int x = (n-3)/2;
		int y = n -1;
		String formato = "%-" + y + "s"+ simbolo + "  %" + n + "s%n";

		for (int i = 0; i < x; i++) {
			System.out.printf(formato,simbolo,simbolo);
		}
	}
	public static void base(int n,char simbolo) {
		
		String formato = "%" + n +"s%n";
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(simbolo);
			
		}
		System.out.print("  ");
		System.out.printf(formato,simbolo);
		
	}
}
