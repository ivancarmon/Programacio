package examen2016;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[][] m = {{1,1,1},
					 {2,3,4},
					 {6,5,2}};

		int[] v = {1,3,5};

		System.out.println(estaElVector(m,v));

	}

	private static int estaElVector(int[][] m, int[] v) {
		boolean iguales = true;
		int res = -1;
		if(v.length == m[0].length) {
			for (int i = 0; i < m.length; i++) {
				iguales = true;
				for (int j = 0; j < m[i].length && iguales; j++) {

					if(m[j][i] != v[j]) iguales = false;


				}
				if(iguales) res = i;


			}
		}
		return res;

	}


}
