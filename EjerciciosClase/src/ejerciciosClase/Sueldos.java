package ejerciciosClase;

import java.util.Scanner;

public class Sueldos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los sueldos que quieres insertar: ");
		int sueldos = sc.nextInt();
		int sueldo = 0;
		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < sueldos; i++) {
			System.out.printf("Introduce sueldo de empleado %d: ", i + 1);
			sueldo = sc.nextInt();
			
			if (sueldo > max) {
				max = sueldo;
			}
			if (sueldo < min) {
				min = sueldo;
			}
			
			

			
		}
		System.out.printf("Sueldo máximo: %d\n", max);
		System.out.printf("Sueldo mínimo: %d", min);
		sc.close();
	}
}
