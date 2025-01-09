package condicionals;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int any = sc.nextInt();
		if (any > 0 && any < 367) {
			if (any == 366) {
				System.out.println("Correcte per un any bixest!");
			}
			else {
				System.out.println("Correcte per un any no bixest!");
			}
		}else {
			System.out.println("Incorrecte!");
		}
	}
}