package condicionals;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int J = sc.nextInt();
		int D = sc.nextInt();
		int B = sc.nextInt();
		if (J > D && J > B) {
			System.out.println("Jiden");
		}
		else if(D > J && D > J){
			System.out.println("Drump");
		}
		else {
			System.out.println("Banders");
		}
		
	}
}
