package ejercicios;

import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("cono(1) o esfera (2)");
		int escoger = sc.nextInt();
		if (escoger == 2) {
			System.out.println("introduce el radio:");
			double r = sc.nextDouble();

			double area = (4 * Math.PI *(r * r));
			double volumen =  (double) 4 / 3 * Math.PI * (r *r *r);
			System.out.println("el area de la esfera es " + area + " y el volumen es " + volumen);

		} else if (escoger == 1){
			System.out.println("introduce radio del cono");			
			double r = sc.nextDouble();
			System.out.println("introduce altura");
			double h = sc.nextDouble();
			double volumen = (double) 1/3 * Math.PI * (r *r) * h;
			System.out.println("el volumen del cono es " + volumen);

		} else {
			System.out.println("no existe tal opcion");
		}








		sc.close();
	}
}
