package depuracio;

import java.util.Scanner;

public class Ejercici4 {
	public static void main(String[] args) {
		int N, i, j;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("Introduce un numero > 0: ");
			N = sc.nextInt();
			
		} while (N <= 0);
		System.out.println("Números primos desde 1 hasta " + N);
		for (j = 2; j < N; j++) {
			i = 2;
			while (j % i == 0) {
				i++;
			}
			if (j %i != 0) {
				System.out.println(j);
			}
		}

	}
}
