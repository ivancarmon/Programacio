package matrius;

import java.util.Scanner;

public class Tetris {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int c = sc.nextInt();
		int [][] m;
		m = new int[f][c];
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j] = sc.nextInt();
				
			}
		}
		System.out.println(tetris(m) == 4 ? "TETRIS" : tetris(m));
		
	}

	public static int tetris(int[][] m) {
		int tetris = 0;
		boolean esTetris = true;
		for (int i = 0; i < m.length && tetris < 4; i++) {
			
			for (int j = 0; j < m[i].length && esTetris; j++) {
				
				if(m[i][j] == 0) esTetris = false;
				
				
			}
			if(esTetris) tetris++;
			esTetris = true;
		}
		
		return tetris;
	}
	
	
}
