package condicionals;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		
		if ( A < 18 || B < 18 || C < 18 || N < 18 || A == B || A == C || A == N || B == C || B == N || C == N) {
			System.out.println("NO");
			
		}else {
			System.out.println("SI");
		}
		
		
	}

}
