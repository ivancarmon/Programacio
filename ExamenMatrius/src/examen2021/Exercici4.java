package examen2021;

public class Exercici4 {
	
	
	public static void main(String[] args) {
		int[][] m = {{-9, -1, 7}, {-2, 8, 4}, {-1, -3, 5}};
		System.out.println(esDiagonaDominante(m) ? "SI" : "NO");
		
		
		
		
	}

	public static boolean esDiagonaDominante(int[][] m) {
		boolean esDominante = true;
		int diag = 0,compr = 0;
		for (int i = 0; i < m.length && esDominante; i++) {
			
			for (int j = 0; j < m.length; j++) {
				
				if(i == j) {
					diag = Math.abs(m[i][j]);
				}
				else {
					compr += Math.abs(m[i][j]);
				}
				
			}
			if(compr >= diag) esDominante = false;
			
			compr = 0;
		}
		
		
		return esDominante;
	}
	
	
	
}
