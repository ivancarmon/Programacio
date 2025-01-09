package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1;
		int numero2 = 0;
		int contador = 0;
		int contMultiplos5 = 0;
		do {
			System.out.println("Ingresa el primer numero:");
			numero1 = sc.nextInt();
		}
		while(numero1<0);
		do {
			System.out.println("Ingresa el segundo numero:");
			numero2 = sc.nextInt();
		}
		while(numero2<numero1);
		
		for (int i = numero1; i <= numero2; i++) {
			if(i % 5 == 0){
				contMultiplos5++;
			}
		}
		System.out.println("La cantidad de números múltiplos de 5 son: " + contMultiplos5);
	}
}
