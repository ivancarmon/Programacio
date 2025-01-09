package funcions;

import java.util.Scanner;

public class ConvertirEnMorse {
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
				result += " _ _ _ _ _";
			}
			else if(n == 1) {
				result += " · _ _ _ _";
			}
			else if(n == 2) {
				result += " · · _ _ _";
			}
			else if(n == 3) {
				result += " · · · _ _";
			}
			else if(n == 4) {
				result += " · · · · _";
			}
			else if(n == 5) {
				result += " · · · · ·";
			}
			else if(n == 6) {
				result += " _ · · · ·";
			}
			else if(n == 7) {
				result += " _ _ · · ·";
			}
			else if(n == 8) {
				result += " _ _ _ · ·";
			}
			else {
				result += " _ _ _ _ ·";
			}


		}
		return result;
	}
}
