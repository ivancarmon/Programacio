package matrius;

import java.util.Scanner;

public class Rellenarcuadrados {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int c = sc.nextInt();
		char[][] m;
		m = RellenarCuadros();
		ImprimirMatriz(m);
		System.out.println();
		m = RellenarCuadros(f, c);
		ImprimirMatriz(m);
		System.out.println();
		m = RellenarCuadros(f,c,'a','b','c','d');
		ImprimirMatriz(m);
		
		
	}
	public static char[][] RellenarCuadros(){
		
		return RellenarCuadros(4, 4);
		
	}
	public static char[][] RellenarCuadros(int f, int col){
		
		return RellenarCuadros(f,col,'1', '2', '3', '4'); 
		
	}
	public static char[][] RellenarCuadros(int f,int col,char a, char b , char c, char d){
		char[][] m = new char[f][col]; 
		int x = m.length;
		
		for (int i = 0; i < x; i++) {
			
			for (int j = 0; j < x; j++) {
				if(j >=x/2 && i < x/2) {
					m[i][j] = b;
				}else if(j <x/2 && i < x/2){
					m[i][j] = a;
				}
				else if(j >=x/2 && i >= x/2) {
					m[i][j] = d;
				}
				else {
					m[i][j] = c;
				}
				 
			}
			
		}

		return m;
		
	}
	
	public static void ImprimirMatriz(char[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			
			for (int j = 0; j < m[i].length; j++) {
				
				System.out.print(m[i][j] + " ");
				
			}
			
			System.out.println();
		}
	}
	
}
