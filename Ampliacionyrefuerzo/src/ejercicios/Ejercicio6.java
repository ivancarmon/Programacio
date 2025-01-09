package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ingrese subtotal(sin iva): ");
		double subtotal = sc.nextDouble();
		double total = (subtotal + (subtotal * 0.21) - (subtotal * 0.15));
		System.out.println("el total a pagar es de "+ total);
		
		sc.close();
		
	}
}
