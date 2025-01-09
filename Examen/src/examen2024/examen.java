package examen2024;

import java.util.Scanner;

public class examen {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char simbolo;
		int n;
		String continuar;
		
		do {
			System.out.println("introduce el simbolo:");
			simbolo = sc.nextLine().charAt(0);
			
			do {
				System.out.println("introduce el tamaño:");
				n = sc.nextInt();
			} while (n < 5 || n % 2 == 0);
			
			String formato1 = "%" + n + "s\n";
			String formato2 = "%-" + n + "s\n" ;
			
			for (int i = 1; i <= n; i++) {
				if (i == 1) {
					System.out.print(simbolo);
				}
				else if (i == n) {
					System.out.print(simbolo);
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for (int i = 0; i < n; i++) {
				System.out.print(simbolo);
			}
			
			System.out.println();
			
			for (int i = 0; i < (n-3)/2; i++) {
				
				for (int j = 1; j <= n; j++) {
					if (j == 1) {
						System.out.print(simbolo);
					}
					else if (j == n) {
						System.out.print(simbolo);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				System.out.printf(formato1 , simbolo);

			}
			
			for (int i = 0; i < n*2 + 2; i++) {
			
				if (i < n) {
					System.out.print(simbolo);
				}
				else if (i > n + 1) {
					System.out.print(simbolo);
				}
				else if(i == n || i == n +1) {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
			for (int i = 0; i < (n-3)/2; i++) {
				for (int j = 1; j <= n; j++) {
					if (j == n) {
						System.out.print(simbolo);
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				System.out.printf(formato2 , simbolo);
			}
			
			for (int i = 1; i <= n; i++) {
				
				if (i == n) {
					System.out.print(simbolo);
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for (int i = 0; i < n; i++) {
				System.out.print(simbolo);
			}
			
			System.out.println();
			System.out.println("------------------------------------");
			System.out.println("¿Desea dibujar otra vez el 42? (s/n)");
			System.out.println("------------------------------------");
			
			sc.nextLine();
			
			continuar = sc.nextLine();
		
		}while(continuar.equalsIgnoreCase("s"));
		
		System.out.println("¡HASTA PRONTO!");

	}
}