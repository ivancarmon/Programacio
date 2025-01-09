package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;
		int div = 0;
		while (true) {
			int media = sc.nextInt();
			if (media == -1) {
				result = (double) result /div;
				break;
			}
			result += media;
			div++;
			
		}
		System.out.println(result);
		sc.close();
	}
}
