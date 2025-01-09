package condicionals;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int any = sc.nextInt();
		if (any >=1945 && any <=1965) {
			System.out.println("ok boomer");
		}
		else {
			System.out.println("nah");
		}
	}
}
