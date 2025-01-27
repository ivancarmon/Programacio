package matrius;

public class cuadradomagico {

	public static void main(String[] args) {

		int[][] m = {{2,9,4},{7,5,3},{6,1,8}};	
		int [][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(esCuadradoMagico(m) ? "Si": "No" );
		
	}
	public static boolean esCuadradoMagico(int [][] m) {
		int sumafila1 = 0;
		for (int i = 0; i < m[0].length; i++) {
			
			sumafila1 += m[0][i];
			
		}
		
		return comprobarFilas(m,sumafila1) && comprobarColumnas(m,sumafila1) && 
		comprobarDiagonal_1(m,sumafila1) && comprobarDiagonal_2(m,sumafila1);
//		return comprobarDiagonal_1(m, sumafila1) && comprobarFilas(m, sumafila1);
		
		
	}
	public static boolean comprobarDiagonal_1(int[][] m, int sumafila1) {
		int aux = 0;
		for (int i = 0; i < m.length; i++) {
			aux += m[i][i];
			if(sumafila1 < aux) return false;
			
		}		
		

		return aux == sumafila1;
		
	}
	public static boolean comprobarDiagonal_2(int[][] m, int sumafila1) {
		int aux = 0;
		boolean continuar = true;
		for (int i = 0; i < m.length && continuar; i++) {
			aux += m[i][m.length - 1 - i];
			if(aux > sumafila1) continuar = false;
			
			
		}
		
		
		return continuar;
	}
	public static boolean comprobarColumnas(int[][] m, int sumafila1) {
		int aux = 0;
		boolean continuar = true;
		for (int i = 0; i < m.length && continuar; i++) {
			aux = 0;
			for (int j = 0; j < m.length; j++) {
				aux += m[j][i];
				if(aux > sumafila1) continuar = false;
			}
			if (aux != sumafila1) continuar = false;
		}
		
		
		
		return continuar;
		
		

	}
	public static boolean comprobarFilas(int[][] m, int sumafila1) {
		int aux = 0;
		boolean continuar = true;
		for (int i = 1; i < m.length && continuar; i++) {
			aux = 0;
			for (int j = 0; j < m.length; j++) {
				aux += m[i][j];
				if(aux > sumafila1) continuar = false;
			}
			if (aux != sumafila1) continuar = false;
		}
		
		
		
		return continuar;
	}
}
