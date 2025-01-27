package depuracio;

import java.util.Scanner;

public class Ejercici1 {
		public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		double radio, longitud, area;
		System.out.println("Introduce radio de la circunferencia:");
		radio = sc.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, Math.PI);
		System.out.println("Longitud de la circunferencia -> " + longitud);
		System.out.println("Area de la circunferencia -> " + area);
		}
}
