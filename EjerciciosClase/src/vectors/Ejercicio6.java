package vectors;
import java.util.Scanner;
import vectors.Ejercicio1;
public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int izq,der,array[],tamano,cont = 0,valor;
//		do {
			tamano = sc.nextInt();
			array = Ejercicio1.rellenarVector(tamano);
//			izq=sc.nextInt();
//			der=sc.nextInt();
			
//		} while (izq < 0 || izq>der || der>array.length);
//		array = invertirElementos(izq, der, array);
//		Ejercicio1.imprimirVector(array);
		
//		for (int i = 0; i < array.length; i++) {
//			
//			cont += contarImparesDentroDePares(array,i);
//			
//		}
//		System.out.printf("el numero de impares en posiciones pares es %d%n",cont);
//		System.out.println("introduce el valor x para saber cuantos numeros hay de una posicion a otra");
//		valor = sc.nextInt();
//		System.out.println("introduce una posicion");
//		izq=sc.nextInt();
//		System.out.println("introduce otra posicion mas grande");
//		der=sc.nextInt();
//		System.out.println("hay " + contarMenores(izq,der,array,valor)+ " menores");
//		if (ComprobarAscendente(array)) {
//		    System.out.println("Esta ordenado ascendente");
//		} else {
//		    System.out.println("No lo esta");
//		}
//		cont = ComprobarSubsecuencia(array);
//		if (cont == -1) {
//			System.out.println("No hay subsecuencia");
//		}
//		else {
//			System.out.printf("Si la hay y esta en la posicion %d hasta %d",cont, cont + 2 );
//		}
			
		
			
	}
	public static int[] multiplicarPor2(int izq,int der,int[]array) {
		
		for (int i = izq; i <= der; i++) {
			
			array[i] *= 2; 
			
		}
		
		return array;
	}
	public static int[] invertirElementos(int izq,int der,int[]v) {
		int v1[] = v.clone();
		int aux;
		while(izq<der) {
			aux = v1[izq];
			v1[izq] = v1[der];
			v1[der] = aux;
			izq++;
			der--;
			
		}
		
		
		return v1;
	}
	public static int contarImparesDentroDePares(int array[],int i) {
		int cont = 0;
		
		if(i % 2 == 0) {
			
			if (array[i] % 2 == 1) {
				cont++;
			
			}
			
		}
		
		
		return cont;
		
	}
	
	public static int contarMenores(int izq,int der,int array[],int valor) {
		int cont = 0;
		
		for (int i = izq; i <= der; i++) {
			
			if(array[i] < valor) {
				cont++;
			}
			
		}
		
		
		
		
		
		return cont;
		
	}
	
	public static boolean ComprobarAscendente(int array[]) {
		int anterior;
		for (int i = 0; i < array.length; i++) {
			if(i == 0) {
				anterior = array[i];
			}
			else {
				anterior = array[i-1];
			}
			if(anterior > array[i]){
				
				return false;
			}
			
		}
		return true;
		
		
	}
	public static int ComprobarSubsecuencia(int array[]) {
		int subsec = -1;
		boolean comp = false;
		for (int i = 0; i < array.length - 2; i++) {
			
			if(array[i+2] == array[i+1] + 1 && array[i+1] == array[i] + 1) {

				subsec = i;
				return subsec;
				
			}
			
			
		}
		
		return subsec;
	}
	
	
	
	
}
