package examen2021;

public class Exercici3 {
	
	public static void main(String[] args) {
		int[][] m = {{1,2,3,5},{4,5,6,20},{7,8,9,30},{1,2,3,4}};
		int[][] m1 = new int[20][20];
		System.out.println(calcular1norma(m));
		
		
		
	}

	public static int calcular1norma(int[][] m) {
		int max = Integer.MIN_VALUE;
		int norma = 0;

		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m.length; j++) {
				
				norma += Math.abs(m[j][i]);
				
			}
			
			if(norma > max) {
				max = norma;
			}
			norma = 0;
		}
		
		
		
		return max;
	}
	
	
}
