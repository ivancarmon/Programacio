package examen2024;

import java.util.Scanner;

public class Ejercici3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x1,x2;
		
		System.out.println("introduzca el valor de a");
		int a = sc.nextInt();
		
		System.out.println("introduzca el valor de b");
		int b = sc.nextInt();
		
		System.out.println("introduzca el valor de c");
		int c = sc.nextInt();
		
		int triangle = b*b - 4 *a*c;
		
		if (triangle < 0) {
			System.out.println("No hay soluciones");
		}
		
		else if(triangle == 0){
			x1 = (double) - b /2 * a;
			System.out.printf("la unica solucion es, %.2f" , x1);
		}
		
		else {
			x1 = (-b + Math.sqrt(triangle))/2 * a;
			x2 = (-b - Math.sqrt(triangle))/2 * a;
			System.out.printf("La primera solucion es, %.2f \n" , x1);
			System.out.printf("La primera solucion es, %.2f" , x2);
		}
		
		System.out.println(triangle);
	}
}
