package triangles;

import java.util.Scanner;

public class Triangles {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double altura = sc.nextDouble();
		double base = sc.nextDouble();
		double resultado = (base * altura)/2;

		System.out.println(resultado);

	}

}
