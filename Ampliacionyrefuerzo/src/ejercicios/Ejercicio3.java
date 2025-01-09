package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		System.out.println("de mb a kb(1) de kb a mb(2)");
		int a = sc.nextInt();
		boolean b = (a == 1);
		
		if (b == true) {
			System.out.println("introduce los megas");
			double MB = sc.nextDouble();
			double KB = MB * 1024;
			System.out.println(MB +" MB son " + KB + " KB");
		}
		else {
			System.out.println("introduce KB");
			double KB = sc.nextDouble();
			double MB = KB/1024;
			System.out.println(KB + " son "+ MB + " MB");
		}




		sc.close();
	}
}
