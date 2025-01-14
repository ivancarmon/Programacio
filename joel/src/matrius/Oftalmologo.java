package matrius;

import java.util.Scanner;

public class Oftalmologo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		char aux;
		int[][] m = {{1,2},{3,4}};
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			aux = s.charAt(i);
			if(aux == 'H') {
				m = invertirHorizontal(m);
			}else if(aux == 'V') {
				
				m = invertirVertical(m);

			}
			
			
		}
		imprimirMatriz(m);
		
		
		sc.close();
	}
	private static int[][] invertirVertical(int[][] m) {
		int aux;
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				aux = m[i][m.length - i - 1];
				m[i][m.length -i -1] = m[i][j];
				m[i][j] = aux;
				
				
			}
						
		}
		
		return m;
	}
	private static int[][] invertirHorizontal(int[][] m) {
		int aux;
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				aux = m[m.length - i - 1][i];
				m[m.length-1-i][i] = m[j][i];
				m[j][i] = aux;
				
				
			}
						
		}
		
		
		return m;
	}
	public static void imprimirMatriz(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}

	}
	
}
