import java.util.Scanner;

public class Matricestriangulares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = sc.nextInt();
			if(n == 0) break;
			int[][] m = new int[n][n];
			for (int i = 0; i < m.length; i++) {

				for (int j = 0; j < m.length; j++) {
					m[i][j] = sc.nextInt();

				}
			}
			System.out.println(esTriangular(m) ? "SI" : "NO");
		}
		sc.close();
	}
	public static boolean esTriangular(int [][] m) {
		boolean continuar = true,continuar2 = true;
		int x = m.length;
		for (int i = 0; i < x && continuar; i++) {
			
			for (int j = i + 1; j < x; j++) {
				if(m[i][j] != 0) {
					continuar = false;
				}
			}
			
		}
		for (int i = 0; i < x && continuar2; i++) {
			
			for (int j = i + 1; j < x; j++) {
				if(m[j][i] != 0) {
					continuar2 = false;
				}
			}
			
		}
		return continuar || continuar2;
	}
}