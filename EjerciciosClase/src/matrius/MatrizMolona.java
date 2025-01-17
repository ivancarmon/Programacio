package matrius;

public class MatrizMolona {
	
	
	public static void main(String[] args) {
		int n;
		int[][] m = {{7,13,7,7,},{13,7,7,7,},{7,7,13,7,},{7,7,7,13}}; 
		int[][] m1 = {{1,0,0,0},{0,1,0,0},{0,0,1,0},{0,0,0,1}};
		System.out.println();
		MatrizesCuriosas.ImprimirMatriz(m);
		System.out.println();
		System.out.println(esMolona(m) ? "SI es molona" : "NO es molona");
		System.out.println();
		MatrizesCuriosas.ImprimirMatriz(m1);
		System.out.println();
		System.out.println(esMolona(m1,0,1) ? "SI es molona" : "NO es molona");
		
	}
	public static boolean esMolona(int[][] m) {
		
		return esMolona(m, 7, 13);
		
	}
	public static boolean esMolona(int[][] m,int a,int b) {
		
		
		return comprobarFila(m,a,b) && comprobarVertical(m,a,b);
	}
	private static boolean comprobarVertical(int[][] m, int a, int b) {
		boolean Vertical = true;
		if(m.length != m[0].length) Vertical = false;
		int cont = 0;
		for (int i = 0; i < m.length && Vertical; i++) {
			
			for (int j = 0; j < m.length; j++) {
				if(m[j][i] != a && m[j][i] != b) Vertical = false;
				if(m[j][i] == b) cont++;
				if(cont != 1 && j == m.length - 1) Vertical = false;
				
			}
			cont = 0;
		}
		
		return Vertical;
	}
	private static boolean comprobarFila(int[][] m, int a, int b) {
		boolean Horizontal = true;
		if(m.length != m[0].length) Horizontal = false;
		int cont = 0;
		for (int i = 0; i < m.length && Horizontal; i++) {
			
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] != a && m[i][j] != b) Horizontal = false;
				if(m[i][j] == b) cont++;
				if(cont != 1 && j == m.length - 1) Horizontal = false;
				
			}
			cont = 0;
		}
		
		return Horizontal;
		
		
	}
}
