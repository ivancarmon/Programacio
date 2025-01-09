package bucles;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int totalpos = 0;
		for (i=n; i>0; i--) {
			int num = sc.nextInt();
				if (num>0){
					totalpos++; 
				}
		}
		System.out.println(totalpos);
		
	}

}


