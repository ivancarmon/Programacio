package vectors;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[], tamano;
		System.out.println("Introduce el tamaño del array: ");
		tamano = sc.nextInt();
		array = rellenarVectorConNumAleatorios(tamano);
		imprimirVector(array);
		sc.close();
	}
	public static int[] rellenarVectorConNumAleatorios(int tamano) {
		Scanner sc = new Scanner(System.in);
		int fin,ini;
		int n1[] = new int[tamano];
		System.out.println("introduce el inicio de los numeros aleatorios: ");
		ini = sc.nextInt();
		System.out.println("introduce el final de los numeros aleatorios: ");
		fin = sc.nextInt();
		
		for (int i = 0; i < n1.length; i++) {
			
			n1[i] = (int)((Math.random()*(fin-ini+1)) + ini);
			
		}
		
		sc.close();
		return n1;
	}
	public static void imprimirVector(int numeros[]) {
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.printf("Posicion %d: %d%n",i+1,numeros[i]);
		}
		
	}
}
