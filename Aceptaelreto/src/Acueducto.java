import java.util.Scanner;

public class Acueducto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos,vector[];
		while(true) {
			casos = sc.nextInt();
			if (casos == 0) {
				break;
			}
			
			vector = rellenarVector(casos);
			System.out.println(minimoNumero(vector));
			
		}

	}
	
	public static int[] rellenarVector(int n) {
		Scanner sc = new Scanner(System.in);

		int n1[] = new int[n];
		int rellenar;
		
		for (int i = 0; i < n1.length; i++) {
			
			rellenar = sc.nextInt();
			n1[i] = rellenar;
			
		}
		
		return n1;
	}
//	public static void imprimirVector(int numeros[]) {
//		
//		for (int i = 0; i < numeros.length ; i++) {
//			System.out.printf("Posicion %d: %d%n",i+1,numeros[i]);
//		}
//		
//	}
	public static int maximoNumero(int numeros[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] > max) {
				max = numeros[i];
			}
			
		}
		return max;
	}
	public static int minimoNumero(int numeros[]) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] < min) {
				min = numeros[i];
			}
			
		}
		return min;
	}
	
}
