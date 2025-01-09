package examen2019;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        String n1s = sc.nextLine();
        System.out.print("Introduzca otro número: ");
        String n2s = sc.nextLine();
        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();


        String pares = "";
        String impares = "";

        int length = n1s.length();

        for (int i = 0; i < length; i++) {
            int digit1 = Integer.parseInt(n1s.substring(i, i + 1));
            int digit2 = Integer.parseInt(n2s.substring(i, i + 1));
            if (digit1 % 2 == 0) {
                pares = pares + digit1;
            } else {
                impares = impares + digit1;
            }

            if (digit2 % 2 == 0) {
                pares += digit2;
            } else {
                impares = impares + digit2;
            }
        }

        // Display the results
        System.out.println();
        System.out.printf("%s, el número formado por los dígitos pares es %s%n", nombre, pares);
        System.out.printf("%s, el número formado por los dígitos impares es %s%n", nombre, impares);

        sc.close();

		
	}
}
