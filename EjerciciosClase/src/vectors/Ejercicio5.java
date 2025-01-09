package vectors;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numdni;
		System.out.println("Introduce tu numero de dni: ");
		numdni = sc.nextInt();
		char letras[] = {'T', 'R','W', 'A', 'G','M','Y','F','P','D','X', 'B', 'N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("tu letra del dni es: " + CalcularLetra(numdni,letras));
		sc.close();
	}
	public static char CalcularLetra(int numdni, char letras[]) {
		
		return letras[numdni % 23];
		
	}
	
}
