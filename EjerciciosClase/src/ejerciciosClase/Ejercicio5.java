package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce nota del primer examen:");
		double x = sc.nextDouble();
		System.out.println("¿que nota quieres sacar al final de la evaluacion?");
		double x1 = sc.nextDouble();
		double Y = (x1-0.4*x)/0.6;

		//condicional para que no ponga mas de 10
		if (Y > 10) {
			
			System.out.println("es imposible sacar esa nota");
		
		}
		else {
			
			System.out.println("para tener un " + x1 + " tienes que sacar un " + Y + " en el siguiente examen");
			
		}
		
		sc.close();
		
		
	}

}
