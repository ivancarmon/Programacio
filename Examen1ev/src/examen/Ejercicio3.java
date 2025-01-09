package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra: ");
		String palabra = sc.nextLine();
		System.out.println(tieneTodasLasVocales(palabra));
		
		sc.close();
	}
	public static String tieneTodasLasVocales(String palabra) {
		char recorrer;
		palabra = palabra.toLowerCase();
		boolean a = false,e = false,i= false,o = false,u = false;
		String result = "";
		for (int j = 0; j < palabra.length(); j++) {
			recorrer = palabra.charAt(j);

			switch (recorrer) {
			case 'a': a = true;
			case 'á': a = true;break;
			
			case 'e': e = true;
			case 'é': e = true;break;
			
			case 'i': i = true;
			case 'ï': i = true;
			case 'í': i = true;break;

			case 'o': o = true;
			case 'ó': o = true;break;

			case 'u': u = true;
			case 'ü': u = true;
			case 'ú': u = true;break;

			}

		}
		if(a && e && i && o && u) {
			result = "Verdadero";
			return result;
		}
		else {
			result = "Falso";
			return result;

		}

	}
}
