package ejerciciosClase;

import java.util.Scanner;

public class Clavesecreta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int clave = sc.nextInt();
		int result = 0;
		int i = 0;
		int sum = 0;
		while(clave > 0) {
			int digit = clave % 10;
			if (digit % 2 == 0) {
				digit++;
			}else {
				digit--;
			}
			result += digit * (int)Math.pow(10, i);
			clave /= 10;
			i++;
		}
		System.out.println(result);
		sc.close();
		
		
	}
}
