package examen;

import java.util.Scanner;

public class Tablamultiplicar2020 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result4;
		int result5;
		System.out.printf("%16s %19s\n", "Tabla del 4" , "Tabla del 5");
		
		
		
		
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			result4 = 4 * i;
			result5 = 5 * i;
			System.out.printf("%8s %2d %1s %2d", "4 X", i, "=" , result4);
			System.out.printf("%12s %2d %-1s %2d\n", "5 X", i, "=", result5);

		}

		
		sc.close();
		
		
	}
}
