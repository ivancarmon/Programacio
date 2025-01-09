package condicionals;

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int duracio = sc.nextInt();
		int marge = sc.nextInt();
		int horaarribada = sc.nextInt();
		int minutsarribada = sc.nextInt();
		int minutstotal = horaarribada * 60 + minutsarribada;
		int tempspassat = minutstotal % duracio;
		if (tempspassat <= marge) {
			System.out.println("VEURE");
		}else {
			System.out.println("MARXAR");
		}
 	}
}