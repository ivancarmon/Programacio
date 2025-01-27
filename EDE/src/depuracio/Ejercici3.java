package depuracio;

import java.util.Scanner;

public class Ejercici3 {
	public static void main(String[] args) { 
		int suma = 0, n;
		Scanner sc = new Scanner(System.in); System.out.println("Introduce un número: "); n = sc.nextInt();
		for (int i = 1; i < n; i++) { 
			if (n % i == 0) { 
				suma += i;
			}
		}
		if (suma == n) System.out.println("Perfecto");
		else System.out.println("No es perfecto");
	}
}
