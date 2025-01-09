package ejercicios;

import java.util.Scanner;

public class Ejercicio2clase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.println("Introduzca un numero impar mayor o igual que 5:");
			n = sc.nextInt();
		}
		while(n % 2 == 0 || n < 5);
		int n1= n -1;
		String formato1 = "%" + n + "s %-" + n1 + "s*";
		String formato2 = "%-" + n1 + "s*";
		String formato3 = "%-" + n + "s %-" + n1 + "s*";
		//imprimir base y primera linea
		for (int i = 0; i < 2*n +1; i++) {
			if(i < n) {
				System.out.print("*");
			}else if (i < n +1) {
				System.out.print("  ");
			}else if(i > n + 2) {
				System.out.printf("*");
			}
		}
		System.out.println();
		//primeras lineas
		for (int i = 0; i < (n - 3)/2 ; i++) {
			System.out.printf(formato1, "*","*");
			System.out.println();
		}
		//lineas separadas
		for (int i = 0; i < 2*n; i++) {
			if (i < n) {
				System.out.print("*");
			}else if(i < n + 1) {
				System.out.print(" ");
			} else if (i == n +2) {
				System.out.printf(formato2, "*");
			}

		}
		System.out.println();
		//lineas separadas
		for (int i = 0; i < (n - 3) / 2; i++) {
			System.out.printf(formato3, "*", "*");
			System.out.println();
		}
		//base(que es lo mismo que la primera linea)
		for (int i = 0; i < 2*n +1; i++) {
			if(i < n) {
				System.out.print("*");
			}else if (i < n +1) {
				System.out.print("  ");
			}else if(i > n + 2) {
				System.out.printf("*");
			}
		}
	}
}
