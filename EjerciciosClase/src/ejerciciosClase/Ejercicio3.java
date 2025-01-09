package ejerciciosClase;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce numero de chicas:");
		int chicas = sc.nextInt();
		System.out.println("Introduce numero de chicos:");
		int chicos = sc.nextInt();
		int total= chicos + chicas;
		double porcentageW = (double) chicas/total * 100;
		double porcentageM = (double) chicos/total * 100;
		System.out.println("porcentaje chicas:" + porcentageW);
		System.out.println("porcentaje chicos:" + porcentageM);


		
	}

}
