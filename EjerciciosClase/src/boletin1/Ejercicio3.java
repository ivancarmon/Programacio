package boletin1;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		if (A <= 0) {
			System.err.println("ERROR");
		}else {
			double B = Math.sqrt(A);
			double C = A*A;
			System.out.printf("Del número %f, su potencia es %f y su raíz %f", A, B, C);
		}
		
		
		
	}
}
