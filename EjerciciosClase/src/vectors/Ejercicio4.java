package vectors;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamano, array[];
		System.out.println("Ingrese el tamaño del array: ");
		tamano = sc.nextInt();
		array = rellenarVectorConNumAleatoriosPrimos(tamano);
		imprimirVector(array);
		System.out.printf("el numero mas grande es %d%n", maximoNumero(array));
		
		
		sc.close();
	}
	public static boolean esPrimo(int numero) {

		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		
		for (int x = 2; x < numero / 2; x++) {
		
			if (numero % x == 0)
				return false;
		}
		
		return true;
	}
	public static int[] rellenarVectorConNumAleatoriosPrimos(int tamano) {
		Scanner sc = new Scanner(System.in);
		int fin,ini,random;
		int n1[] = new int[tamano];
		System.out.println("introduce el inicio de los numeros aleatorios: ");
		ini = sc.nextInt();
		System.out.println("introduce el final de los numeros aleatorios: ");
		fin = sc.nextInt();
		
		for (int i = 0; i < n1.length; i++) {
			random = GenerarRandom(ini, fin);
			do {
				if(!esPrimo(random)) {
					random = GenerarRandom(ini, fin);				}
				if(esPrimo(random)) {
					n1[i] = random;
				}
				
			} while (!esPrimo(random));
		}
		
		sc.close();
		return n1;
	}
	public static void imprimirVector(int numeros[]) {
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.printf("Posicion %d: %d%n",i+1,numeros[i]);
		}
		
	}
	public static int GenerarRandom(int ini, int fin) {
		
		return (int)((Math.random()*(fin-ini+1)) + ini);
	}
	public static int maximoNumero(int numeros[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > max) {
				max = numeros[i];
			}
			
		}
		return max;
	}
	
}
