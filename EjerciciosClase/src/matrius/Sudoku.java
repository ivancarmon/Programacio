package matrius;

import java.util.Scanner;

public class Sudoku {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,num;
		int[][] m = {{0,3,0,0,0,0,9,0,0},{0,0,6,0,0,0,0,0,0},{0,0,0,2,4,1,0,3,0},{0,0,0,9,0,0,7,0,0},{0,0,0,0,0,2,0,0,4},{0,8,0,0,7,0,0,2,0},{8,5,0,0,0,0,0,0,0},{0,9,0,7,0,4,0,0,0},{0,0,0,0,0,6,0,0,1}};
		do {
			ImrpimirSudoku(m);
			
			System.out.println("introduce las cordenadas: ");
			x = sc.nextInt();
			y = sc.nextInt();
			System.out.println("introduce el numero a insertar: ");
			num = sc.nextInt();
			insertarNumero(m, x, y, num);
			
		} while(!Numeros(m) || !comprobarVertical(m,y,num) || !comprobarHorizontal(m,x,num) || !comprobarCuadro(m,x,y,num) || !Numeros(m)) ;
		ImrpimirSudoku(m);
		System.out.println("¡Has ganado!");
		sc.close();
	}
	private static boolean Numeros(int[][] m) {
		boolean Numeros = true;
		for (int i = 0; i < m.length && Numeros; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == 0) Numeros = false;
			}
		}
		
		return Numeros;
	
	}
	public static void ImrpimirSudoku(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				
				if (m[i][j] == 0) {
					System.out.print("| ");
					if(j == m.length - 1) System.out.print("|");
				}
				else if(j == m.length - 1) System.out.printf("|" + m[i][j] + "|");
				else System.out.printf("|" + m[i][j]);

			}
			System.out.println();
		}


	}
	public static boolean comprobarVertical(int[][] m,int y,int num) {
		boolean Vertical = true;
		for (int i = 0; i < m.length && Vertical; i++) {
			
			if (m[i][y] == num) Vertical = false;
			
		}
		
		return Vertical;
	}
	public static int[][] insertarNumero(int[][] m, int x,int y,int num){
		//if(!comprobarVertical(m,x,num)) System.out.println("Ya esta ese numero en esa columna");
		if(comprobarVertical(m,y,num) && comprobarHorizontal(m,x,num)&& comprobarCuadro(m,x,y,num)) m[x][y] = num;
		
		
		return m;
	}
	private static boolean comprobarHorizontal(int[][] m, int x, int num) {
		boolean Horizontal = true;
		for (int i = 0; i < m.length && Horizontal; i++) {
			
			if (m[x][i] == num) Horizontal = false;
			
		}
		
		return Horizontal;
	}
	private static boolean comprobarCuadro(int[][] m, int x, int y, int num) {
		boolean cuadro = true;
		
		
		
		
		return cuadro;
	}

	
}
