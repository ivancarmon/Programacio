package condicionals;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n1 = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		if(n2 > n1){
			if (n3 < n2 && n4 > n3 && n5 < n4) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
			
			
		}else if (n2 < n1) {
			if (n3 > n2 && n4 < n3 && n5 > n4) {
				System.out.println("SI");
				
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
	}
}