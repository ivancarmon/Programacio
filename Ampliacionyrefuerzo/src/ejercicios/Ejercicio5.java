package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("triangulo(1) o rectangulo(2)");
		int escoger = sc.nextInt();
		switch (escoger) {
		case 1:
			System.out.println("introduce el base:");
			double bt = sc.nextDouble();
			System.out.println("introducir la altura:");
			double ht = sc.nextDouble();
			double areat =  (bt * ht ) / 2 ;
			System.out.println("el area del triangulo es " + areat );
			break;
		case 2:
			System.out.println("introduce el base:");
			double br = sc.nextDouble();
			System.out.println("introducir la altura:");
			double hr = sc.nextDouble();
			double arear =  (br * hr);
			System.out.println("el area del rectangulo es " + arear );
			break;
		default:
			System.out.println("no existe tal opcion");
			break;
		}







		sc.close();


	}
}
