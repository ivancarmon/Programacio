package matrius;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,x,y;
		int[][] m = new int[9][9];
		while(!comprobarVictoria(m)) {
			System.out.println("Introduce el numero:");
			num = sc.nextInt();
			System.out.println("Introduce las cordenadas: ");
			x = sc.nextInt();
			y= sc.nextInt();
			m = introducirNumeros(m,num,x,y);
			ImprimirSudoku(m);
			
		}
		ImprimirSudoku(m);
		System.out.println("Felicidades has completado el Sudoku");
		sc.close();
	}
	private static int[][] introducirNumeros(int[][] m, int num,int x,int y) {
		
		if(comprobarVertical(num, m,x) && comprobarHorizontal(m) && comprobarCuadrado(m))
		return m;
	}
	private static boolean comprobarVictoria(int[][] m) {
		boolean Victoria = false,Numeros = true;
		
		for (int i = 0; i < m.length && Numeros; i++) {
			
			for (int j = 0; j < m.length; j++) {
				
				if(m[i][j] == 0) Numeros = false;
				
			}
			
		}
		if(Numeros && comprobarVertical(m) && comprobarHorizontal(m) && comprobarCuadrado(m)) Victoria = true;
		
		return Victoria;
	}
	public static void ImprimirSudoku(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				if(m[i][j] !=0) {
					System.out.print(m[i][j] + " ");
				}
			}

			System.out.println();
		}
	}
	public static boolean comprobarVertical(int[][] m,int num,int x,int y) {
		boolean Vertical = true;
		int[] numeros = new int[9];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if(i == x) {
					numeros[j] = m[i][j];
					
					
				}
				
				
			}
			
		}
		
		
		
		
		
		return Vertical;
	}


}
