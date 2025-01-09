package ejerciciosClase;

import java.util.Iterator;
import java.util.Scanner;

public class Parsiimpars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont=10;
		int pars = 0;
		int impars = 0;
		int sumedia = 0;
		int contmedia = 0;
		double media = 0;
		int sum = 0;
		for (int i = 0; i < cont; i++) {
			System.out.println("Introduczca un numero: ");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				pars++;
				sum = sum + n;
			}else {
				impars++;
				contmedia++;
				sumedia += n;
				media = ((double) sumedia / contmedia);


			}
		}
		System.out.printf("%16s %23s\n", "Números pares" , "Números impares");
		for (int i = 0; i < 40; i++) {
			System.out.print("-");
		}
		System.out.printf("\n%16d %23d\n", pars , impars);
		System.out.printf("%16d %23.2f", sum, media);
	}
}

