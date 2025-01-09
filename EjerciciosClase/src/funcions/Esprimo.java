package funcions;

import java.util.Scanner;

public class Esprimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 0;
		for (int i = 2; i <= n; i++) {
			if (esPrimo(i) == true) {
				System.out.printf("\033[31m%-6d\033[0m",i);
				cont++;
			}
			else {
				System.out.printf("%-6d", i );
				cont++;
			}
			if (cont % 4 == 0) {
				System.out.println();
			}
		}
	sc.close();	
	}
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }


        return true;
    }
}
