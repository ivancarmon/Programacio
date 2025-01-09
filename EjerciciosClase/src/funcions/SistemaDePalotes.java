package funcions;

import java.util.Scanner;

public class SistemaDePalotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(ConvierteEnPalotes(n));
		sc.close();
	}
	public static String ConvierteEnPalotes(int n) {
		
		
		String s = Integer.toString(n);
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			
			n = Character.getNumericValue(s.charAt(i));
			for (int j = 0; j < n; j++) {
				result += "|";
			}
			if (i != s.length() - 1) {
				result += " - ";	
			}
			
		}
		return result;
	}
}
