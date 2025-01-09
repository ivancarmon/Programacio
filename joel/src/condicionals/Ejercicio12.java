package condicionals;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println(Math.max(n1, Math.max(n2, n3)) - Math.min(n1, Math.min(n2, n3)));
		
		
	}
}
