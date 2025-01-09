package funcions;

import java.util.Scanner;

public class ConvertirNumerosAPalabras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ConvertirEnPalabras(n));
		sc.close();
	}
	public static String ConvertirEnPalabras(int n) {

		String s,result="";
		s = Integer.toString(n);
		
		for (int i = 0; i < s.length(); i++) {
			n = Character.getNumericValue(s.charAt(i));
			if (n == 0){
				result += "cero";
			}
			else if(n == 1) {
				result += "uno";
			}
			else if(n == 2) {
				result += "dos";
			}
			else if(n == 3) {
				result += "tres";
			}
			else if(n == 4) {
				result += "cuatro";
			}
			else if(n == 5) {
				result += "cinco";
			}
			else if(n == 6) {
				result += "seis";
			}
			else if(n == 7) {
				result += "siete";
			}
			else if(n == 8) {
				result += "ocho";
			}
			else {
				result += "nueve";
			}
			if (i != s.length() - 1) {
				result += ", ";
			}

			
		}
		return result;
	}
}
