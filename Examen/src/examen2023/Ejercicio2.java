package examen2023;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int n;
		int sum = 0;
		int n1;
		int parymultde3 = 0;
		double media;
		do{
			sum = 0;
			parymultde3 = 0;
			System.out.println("Dame un número:");
			n = sc.nextInt();
			n1 = n;
			if(n>0) {
			while(n > 0) {
				int i = n % 10;
				if (i % 2 == 0 || i % 3 == 0) {
					parymultde3++;
					sum += i;
				}
				n = n/10;
			}
			media = (double)sum/parymultde3; 
			System.out.printf("\t%s %19s", "Dígitos encontrados", "Media");
			System.out.printf("\n\t");
			for (int i = 0; i < 41; i++) {
				System.out.print("-");
			}
			System.out.println();
			System.out.printf("\t %8d %28.2f \n\n", parymultde3, media);
			}
		}while (n1 != -1);
		System.out.println();
		System.out.println("FIN DEL PROGRAMA");
	}
}
