package vectors;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declarar un array
		int[] numeros;
		int[] numerosInvertidos;
		//Pedir al usuario el tamaño del vector
		System.out.println("Introduce el tamaño del vector:" );
		int n = sc.nextInt();
		//Crear vector de tamaño que quiera el usario
		numeros = rellenarVector( n );
		//Imprimir el vector con los datos introducidos por el usuario.
		//Se imprimirá la posición del vector y el contenido: "Posición 1: 45”
		imprimirVector( numeros );
		//Calcular la suma de todos los elementos del vector
		int suma = sumarElementos( numeros );
		System.out.println(suma);
		//System.out.println("La suma de los elementos del vector es: " + suma);
		//Obtener el valor máximo de los elementos del vector
		int max = maximoNumero( numeros );
		System.out.println(max);
		//System.out.println("El valor máximo de los elementos del vector es: " + max);
		//Invertir los valores del vector e imprimir el resultado
		numerosInvertidos = invertirVector(numeros);
		System.out.println("El vector invertido es: ");
		imprimirVector( numerosInvertidos );
		sc.close();
	}
	public static int[] rellenarVector(int n) {
		Scanner sc = new Scanner(System.in);

		int n1[] = new int[n];
		int rellenar;
		for (int i = 0; i < n1.length; i++) {
			System.out.printf("Introduce el valor num %d: %n",i+1);
			rellenar = sc.nextInt();
			n1[i] = rellenar;
			
			
		}
		
		return n1;
	}
	public static void imprimirVector(int numeros[]) {
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.printf("Posicion %d: %d%n",i+1,numeros[i]);
		}
		
	}
	public static int sumarElementos(int n[]) {
		int suma = 0;
		for (int i = 0; i < n.length; i++) {
			
			suma += n[i];
			
		}
		return suma;
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
	public static int[] invertirVector(int numeros[]) {
		int invertidos[] = new int[numeros.length];
		
		for (int i = invertidos.length - 1; i >= 0; i--) {
				
			invertidos[i] = numeros[invertidos.length - 1 -i];
			
		}
		
		return invertidos;
	}
}
