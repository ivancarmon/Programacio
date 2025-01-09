package condicionals;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		if (H >= 0 && H < 24 && M >= 0 && M <=59 && S >= 0 && S <=59) {
			System.out.println("SI");
			
		}
		else {
			System.out.println("NO");
		}
		
		
		
	}
}
