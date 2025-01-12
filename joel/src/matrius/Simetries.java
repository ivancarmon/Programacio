package matrius;

import java.util.Scanner;

public class Simetries {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int x,y;
		char[][] m;
		for (int i = 0; i < casos; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			m = new  char[x][y];
			for (int j = 0; j < x; j++) {
				for (int j2 = 0; j2 < y; j2++) {

					m[j][j2] = sc.next().charAt(0); 

				}
			}
			if(esHorizontal(m,x,y) && esVertical(m,x,y)) System.out.println("DOBLE");
			else if(esHorizontal(m,x,y)) System.out.println("HORITZONTAL");
			else if(esVertical(m,x,y)) System.out.println("VERTICAL");
			else System.out.println("CAP");
		}




		sc.close();
	}
	private static boolean esHorizontal(char[][] m,int x,int y) {
		boolean esHorizontal = true;
		for (int i = 0; i < y && esHorizontal; i++) {

			for (int j = 0; j < x  / 2; j++) {

				if(m[j][i] != m[x - 1 - j][i]) esHorizontal = false;

			}

		}

		return esHorizontal;

	}
	public static boolean esVertical(char[][] m,int x,int y) {
		boolean esVertical = true;
		for (int i = 0; i < x && esVertical; i++) {

			for (int j = 0; j < y  / 2; j++) {

				if(m[i][j] != m[i][y - 1 - j]) esVertical = false;

			}

		}

		return esVertical;
	}
	public static void imprimirMatriz(char[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
