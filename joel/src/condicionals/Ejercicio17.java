package condicionals;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnes = sc.nextInt();
		int temperatura = sc.nextInt();
		String comandament = sc.next().toUpperCase();
		if (temperatura > 25 && comandament.equals("SI")) {
			System.out.println("Aire");
		}else if (alumnes > 15 && temperatura > 22 && temperatura <= 25 && comandament.equals("SI")){
			System.out.println("Aire");
			
		}else if (alumnes > 15 && temperatura > 22 && temperatura <=25 && comandament.equals("NO")){
			System.out.println("Obrir Finestra");
			
		}else if (alumnes > 15 && temperatura > 18) {
			System.out.println("Obrir Finestra");
		}else {
			System.out.println("Res");
		}
		
		
		
	}

}
