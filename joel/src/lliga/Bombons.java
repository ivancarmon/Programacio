package lliga;

import java.util.Scanner;

public class Bombons {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnes = sc.nextInt();
		int bombons = sc.nextInt();
		int salida;
		if (bombons > alumnes) {
			salida = bombons - alumnes;
			System.out.printf("OK: %d",salida);
		}else if(alumnes > bombons){
			salida = alumnes - bombons;
			System.out.printf("KO: %d",salida);
		}else if(alumnes == 0 && bombons == 0) {

		}else {
			System.out.println("OK");
		}
		
	}
}
