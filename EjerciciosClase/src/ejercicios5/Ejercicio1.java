package ejercicios5;

import java.util.Scanner;

public class Ejercicio1 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String contra;
		System.out.println("La contraseña debe cumplir los siguientes requisitos:");
		System.out.println("La contraseña tiene que tener mas de 8 caracteres");
		System.out.println("La contraseña tiene que conter minimo 2 mayúsculas");
		System.out.println("La contraseña tiene que conter minimo 3 minúsculas");
		System.out.println("La contraseña tiene que conter minimo un digito");
		System.out.println("La contraseña tiene que conter minimo tiene que contener uno de estos caracteres: !”$%&/(");
		System.out.println("La contraseña no debe contener ningun @");

		do {
			
			System.out.println("Introduce la contraseña:");
			contra = sc.nextLine();
			
			
		} while (comprabarContrasenya(contra) == false);
		
		sc.close();
	}
	public static boolean comprabarContrasenya(String contra) {
		int mayusculas = 0,minusculas = 0;
		char caracter;
		boolean longitud = false,mayus = false,minus = false,digito = false,caracteresp = false ,arroba = true;
		for (int i = 0; i < contra.length(); i++) {

			caracter = contra.charAt(i);
			if (Character.isUpperCase(caracter)) {
				mayusculas++;
				
			}
		}
		for (int i = 0; i < contra.length(); i++) {

			caracter = contra.charAt(i);
			if (Character.isLowerCase(caracter)) {
				minusculas++;
			}
		}
		for (int i = 0; i < contra.length(); i++) {
			
			caracter = contra.charAt(i);
			
			if(Character.isDigit(caracter)) {
				
				digito = true;
				break;
				
			}
			
		}
		for (int i = 0; i < contra.length(); i++) {
			
			caracter = contra.charAt(i);
			
			if (caracter == '!'|| caracter == '"' || caracter == '$' || caracter == '%'|| caracter == '&'|| caracter == '/' || caracter == '(' || caracter == ')') {
				
				caracteresp = true;
				break;
			}
			
		}
		for (int i = 0; i < contra.length(); i++) {
			
			caracter = contra.charAt(i);
			
			if (caracter == '@') {
				
				arroba = false;
				break;
			}
			
		}
		if(mayusculas >= 2) {
			mayus = true;
		}
		if(minusculas > 3) {
			minus = true;
		}
		if(longitud && mayus && minus && digito && caracteresp && arroba) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
}
