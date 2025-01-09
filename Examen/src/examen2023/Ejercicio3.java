package examen2023;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame el número de estudiantes: ");
		int n = sc.nextInt();sc.nextLine();
		String peto;
		int rojo = 0;
		int azul = 0;
		for (int i = 0; i < n; i++) {
			peto = sc.nextLine();
			if(peto.equalsIgnoreCase("A")) {
				azul++;
			}else if(peto.equalsIgnoreCase("R")) {
				rojo++;
			}else {
				System.out.println("Color inválido. Prueba de nuevo");
				i--;
			}

		}
		if(rojo== azul) {
			System.out.println("¡Hay partido! :)");
		}else {
			System.out.println("No hay partido :(");
		}
		
		
		
		sc.close();
		
	}
}
