package matrius;
import java.util.Scanner;

public class Bomberman {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res;
		int f = sc.nextInt();
		int c = sc.nextInt();
		int [][] m;
		m = new int[f][c];
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				m[i][j] = sc.nextInt();
				
			}
		}
		
		int y = sc.nextInt();
		int x = sc.nextInt();
		res = SacarPuntos(x,y,m);
		System.out.println(res);
		

	}

	public static int SacarPuntos(int x, int y, int[][] m) {
		int suma = 0;
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				if(i == y || j == x) {
					suma += m[i][j];
				}
			}
			
		}
		
		
		return suma;
	}

	
}
