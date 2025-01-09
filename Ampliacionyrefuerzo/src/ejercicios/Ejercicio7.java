package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce las horas trabajadas semanalmente: ");
		double horas = sc.nextDouble();
		double salario = horas * 12;
		System.out.println("Tu salario semanal es de " + salario + "€");
		sc.close();
	}

}
