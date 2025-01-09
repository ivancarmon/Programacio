package examen;

import java.util.Scanner;

public class ImprimirLU {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la altura de la palabra:");
		int n = sc.nextInt();sc.nextLine();
		int n1  = n-1;
		System.out.println("introduzca caracter(excepto '%'):");
		char simbolo = sc.nextLine().charAt(0);
		int bucles;
		do{
		System.out.println("Cuantos bucles for para la base 1 o 3:");
		bucles = sc.nextInt();
		}
		while(bucles != 3 && bucles != 1);
		String formato = "%-" + n + "s %-" + n1 + "s"+ simbolo + "\n";
		//imprimir n -1 lineas
		for (int i = 0; i < n-1; i++) {
			System.out.printf(formato, simbolo, simbolo);
		}

		//imprimir base
		switch(bucles) {
		case 3:
			for (int i = 0; i < n; i++) {
				System.out.print(simbolo);
			}
			for (int i = 0; i < 2; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < n-2; i++) {
				System.out.print(simbolo);
			}
			break;
		case 1:
			for (int i = 0; i < 2*n; i++) {
				if(i > n-1 && i < n+2) {
					System.out.print(" ");

				}
				else {
					System.out.print(simbolo);
				}
			break;
		}
//		for (int i = 0; i < n; i++) {
//			System.out.print(simbolo);
//		}
//		for (int i = 0; i < 2; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 0; i < n-2; i++) {
//			System.out.print(simbolo);
//		}

//		for (int i = 0; i < 2*n; i++) {
//			if(i > n-1 && i < n+2) {
//				System.out.print(" ");
//
//			}
//			else {
//				System.out.print(simbolo);
//			}
			sc.close();
		}
	}
}