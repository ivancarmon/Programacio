package suma2;

import java.util.Scanner;

public class suma2 {
	
	public static void main(String[] args) {
		
		//System.out.println("introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int numero2 = sc.nextInt();
		int resultado = numero + numero2;
		
		System.out.println(resultado);
	}
}
