package examen2021;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int n = sc.nextInt();
		int a;
		if (n == 0) {
			System.out.println("1");
		}else {
			a = n-1;
			while(a > 1) {
				n *=a;
				a--;
			}
			System.out.println(n);
		}
		sc.close();
	}
}
