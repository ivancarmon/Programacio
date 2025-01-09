package examen2023;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		int cont = 0;
		do{
			n = sc.nextInt();
			sum += n;
			cont++;

		}while(n>0);
		if(sum == 0) {
			System.exit(0);
		}
		cont--;
		if (sum % cont == 0) {
			System.out.println("EQUITATIVO");
		}else {
			System.out.println("DESIGUAL");
		}
		sc.close();
	}
}
