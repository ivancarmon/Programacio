package matrius;

public class Sudoku {

	public static void main(String[] args) {
		int[][] m = new int[9][9];
		while(comprobarVictoria(m)) {
			ImprimirSudoku(m);
			
		}
		ImprimirSudoku(m);
		comprobarVictoria(m);


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
	public static 


}