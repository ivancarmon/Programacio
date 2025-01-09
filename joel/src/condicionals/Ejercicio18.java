package condicionals;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Entrada = sc.next().toLowerCase();
		switch(Entrada) {
		case "coratge":
			System.out.println("Gryffindor");
			break;
		case "coneixement":
			System.out.println("Ravenclaw");
			break;
		case "ambicio":
			System.out.println("Slytherin");
			break;
		default:
			System.out.println("Hufflepuff");
			break;
		}
		
		
	}
}
