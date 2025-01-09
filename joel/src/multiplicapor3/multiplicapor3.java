package multiplicapor3;

import java.util.Scanner;

public class multiplicapor3 {
	
	public static void main(String[] args) {
		
		System.out.println("introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int resultado = numero * 3;
		
		System.out.println(resultado);
	}
	

}
