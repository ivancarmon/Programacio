package caramels;

import java.util.Scanner;

public class Caramels {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
		int resultado = numero % numero2;
		System.out.println(resultado);
		

		
	}

}
