package ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce grados celsius:");
		double C = sc.nextDouble();
		double F = (double)9 / 5 * C + 32;
		
		System.out.println(C + " Cº son " + F + " Fº");
		
		sc.close();
		
	}

}
