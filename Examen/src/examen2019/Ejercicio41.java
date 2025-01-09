package examen2019;

import java.util.Scanner;

public class Ejercicio41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número: ");
		String num1 = sc.nextLine();
		System.out.print("introduzca otro número: ");
		String num2 = sc.nextLine();
		System.out.print("introduzca su nombre:");
		String nombre = sc.nextLine();
		int length = num1.length();
		int digit1 ,digit2;
		String pars = "";
		String impars = "";
		for (int i = 0; i < length; i++) {
			digit1 = Integer.parseInt(num1.substring(i, i + 1));
			digit2 = Integer.parseInt(num2.substring(i, i + 1));
			if (digit1 % 2 == 0) {
				pars += digit1;
			}else {
				impars += digit1;
			}
			if (digit2 % 2 == 0) {
				pars += digit2;
			}else {
				impars += digit2;
			}
		}
		System.out.printf("%s, el número formado por los dígitos pares es %s%n", nombre , pars);
		System.out.printf("%s, el número formado por los dígitos impares es %s",nombre , impars);
		sc.close();
	}
}
