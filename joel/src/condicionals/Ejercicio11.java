package condicionals;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
//		int min = Math.min(n1, n2);
//		int max = Math.max(n1, n2);
//		int result = max - min;
		System.out.println(Math.max(n1, n2) - Math.min(n1, n2));
	}

}