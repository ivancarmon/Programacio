package bucles;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalnotas = 0;
		int total10 = 0;
		while(true) {
			int nota = sc.nextInt();
				if (nota>=0 && nota <= 10){
					totalnotas++; 
				}if (nota == 10) {
					total10++;
				}if (nota == -1) {
					break;
				}
		}
		System.out.println("TOTAL NOTES: " + totalnotas +  " NOTES10: " + total10);
		
	}

}
