package matrius;

public class Ejercicio1 {
	public static void ImprimirMatriz(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
