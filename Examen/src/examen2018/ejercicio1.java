package examen2018;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c = 0,mc = 0,mec = 0;
		n = sc.nextInt();
;		System.out.println(Algoritmo());
	}
	public static String Algoritmo() {
		Scanner sc = new Scanner(System.in);
		String result;
		int mc = 0,mec = 0,c = 0,n;
		
		while(c!=10) {
			c++;

			n = sc.nextInt();
			if (n > 0) {
				mc++;
			}
			else {
				mec++;
			}
		}
		result =  "Mayor = "+ mc + "\nMenor = "+ mec; 
		sc.close();
		return result;
		}

}
