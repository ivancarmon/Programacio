package condicionals;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nota = sc.nextInt();
		if (nota <= 4) {
			System.out.println("Suspes");
		}else if(nota == 5 || nota == 6){
			System.out.println("Aprovat");
			
		}else if(nota == 7 || nota == 8 ){
			System.out.println("Notable");
		}else if(nota == 9 || nota == 10) {
			System.out.println("Excelent");
		}
	}
}
