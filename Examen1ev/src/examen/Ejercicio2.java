package examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura,anchura,cm2;
		double preciocm2,escudo = 0.0,total;
		final double gastosdeenvio = 3.25;
		char bordado;
		System.out.print("Introduzca la altura de la bandera en cm: ");
		altura = sc.nextInt();
		System.out.print("Ahora introduzca la anchura: ");
		anchura = sc.nextInt();sc.nextLine();
		System.out.print("¿Quiere escudo bordado? (s/n): ");
		bordado = sc.next().charAt(0);
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		cm2  = anchura * altura;
		preciocm2 = sacarPrecioBanderaPorCm2(cm2);
		
		if (tieneEscudo(bordado)) {
			escudo = 2.50; 
		}
		total = sacarTotal(preciocm2,escudo,gastosdeenvio);
		System.out.printf("%-24s","Bandera de " + cm2 + " cm2:");
		System.out.printf("%.2f €%n",preciocm2);
		if(escudo == 2.50) {
			System.out.printf("%-24s","con escudo:");
			System.out.printf("%.2f €%n",escudo);
		}
		else {
			System.out.printf("%-24s","sin escudo:");
			System.out.printf("%.2f €%n",escudo);
		}

		System.out.printf("%-24s","gastos de envío:");
		System.out.printf("%.2f €%n",gastosdeenvio);
		
		System.out.printf("%-24s","Total:");
		System.out.printf("%.2f €%n",total);
		
		
		
		
		sc.close();
		
	}public static double sacarPrecioBanderaPorCm2(int cm2) {
		
		double preciocm2 = (double) cm2 / 100;  
		return preciocm2;
	}public static boolean tieneEscudo(char bordado) {
		
		
		return bordado == 's';

	}
	public static double sacarTotal(double preciocm2,double escudo,double gastosdeenvio) {
		double total = preciocm2 + escudo + gastosdeenvio; 
		return total;
	}
	
}
