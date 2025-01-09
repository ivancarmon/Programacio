package ejerciciosClase;

import java.util.Scanner;

public class Sueldosv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sueldo = 0;
		int max = 0 , min = Integer.MAX_VALUE;
		int cont = 0;
		while(true){
			cont ++;
			System.out.printf("Introduce sueldo de empleado %d: ", cont);
			sueldo = sc.nextInt();
			if(sueldo == 0) {
				break;
			}
			if (sueldo > max) {
				max = sueldo;
			}
			if (sueldo < min) {
				min = sueldo;
			}




		}
		if(cont == 1 && sueldo == 0 ) {
			System.out.println("eres tonto");
			System.exit(0);
		}
		System.out.printf("Sueldo máximo: %d\n", max);
		System.out.printf("Sueldo mínimo: %d", min);
		sc.close();
	}
}
