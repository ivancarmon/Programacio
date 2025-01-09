package boletin1;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int result = 0;
		int N = sc.nextInt();
		int i;
		for (i = N; i > 0; i--) {
			result += i;
		}
		
		
//		while(N > 0) {
//
//			result += N;
//			N--;
//		}
		System.out.println(result);
	}
}

