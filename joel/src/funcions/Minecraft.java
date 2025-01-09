package funcions;

import java.util.Scanner;

public class Minecraft {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		int corredors, diamants = 0;
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++) {
			diamants = 0;
			corredors = sc.nextInt();sc.nextLine();
			for (int j = 0; j < corredors; j++) {
				s = sc.nextLine();
				diamants += calcularDiamantes(s);
			}
			System.out.println(diamants);
			
		}			
		

		
		
	}
	public static int calcularDiamantes(String s) {
		int cont = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == '{' && s.charAt(i+1) == '}') {
				cont++;
			}
			
		}
		
		
		return cont;
	}
}
