package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce euros:");
		double euros = sc.nextDouble();
		double dolares = euros * 1.11;
		
		System.out.println("son " + dolares + " dolares");
		sc.close();
		
	}
}
