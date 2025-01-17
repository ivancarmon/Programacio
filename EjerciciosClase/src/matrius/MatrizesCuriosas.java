package matrius;

public class MatrizesCuriosas {
	
	
	
	public static void main(String[] args) {
		int n = 7;
		int[][] m = new int[n][n];
		m = matrizCuriosa(m,n);
		ImprimirMatriz(m);
		
		
	}

	private static int[][] matrizCuriosa(int[][] m, int n) {
		int cont;
		for (int i = 0; i < m.length; i++) {
			cont = 1 + i; 
			for (int j = i; j < m.length; j++) {
				
				m[i][j] = cont;
				cont += m.length - j + i;
				
			}
			
		}
		
		
		return m;
	}

	public static void ImprimirMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%3d",m[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	

}
