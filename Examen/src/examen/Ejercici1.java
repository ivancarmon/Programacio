package examen;

import java.util.Scanner;

public class Ejercici1 {
	public static void main(String[] args) {
		
		String s;
		int part,gan;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Dime el número de participantes en la carrera: ");
		part = sc.nextInt();
		System.out.print("Dime el nombre de la ganadora: ");
		s = sc.next();
		System.out.print("Dime la línea de salida de la ganadora: ");
		gan = sc.nextInt();
		System.out.println();
		imprimirSalida(part);
		imprimirLineaDeSalidaYGanadora(part,gan,s);
		
		
		
		sc.close();
	}
	public static void imprimirSalida(int part) {
		
		System.out.println("SALIDA");
		
		for (int i = 0; i < part; i++) {
			System.out.print("-");
		}
		
		System.out.println();
	}
	public static void imprimirLineaDeSalidaYGanadora(int part,int gan,String s) {
		
		for (int i = 0; i < part; i++) {

			//imprimir espacios
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			

			if(ComprobarNombre(gan,i + 1)) {
				System.out.println("* " + s);
			}
			else {
				System.out.println("*");
			}
		}
		
		
	}
	public static boolean ComprobarNombre(int gan,int i) {
		
		return i == gan;
	}
}
