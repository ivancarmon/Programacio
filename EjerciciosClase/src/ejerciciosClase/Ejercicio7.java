package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("cuantas variables:");
		int escoger = sc.nextInt();
		switch (escoger) {
		case 3:
			System.out.println("introduce el valor de A");
			int a3 = sc.nextInt();
			System.out.println("introduce el valor de B");
			int b3 = sc.nextInt();
			int aux;
			
			aux = a3;
			a3 = b3;
			b3 = aux;
			
			System.out.println("El valor de A es " + a3);
			System.out.println("El valor de B es " + b3);
			break;
		case 2:
			System.out.print("introduce el valor de A");
			int a2 = sc.nextInt();
			System.out.print("introduce el valor de B");
			int b2 = sc.nextInt();
			a2 = b2 + a2;
			b2 = a2 - b2;
			a2 = a2 - b2;
			
			System.out.println("El valor de A es " + a2 );
			System.out.println("El valor de B es " + b2 );
			break;
		}
		
	}
}
