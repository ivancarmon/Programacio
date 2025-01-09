import java.util.Scanner;

public class Clarasyoscuras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int ancho,alto, claras, oscuras;
		claras = 0;
		int total;
		for (int i = 0; i < casos; i++) {
			ancho = sc.nextInt();
			alto = sc.nextInt();
			total = ancho * alto;
			if (total % 2 == 1) {
				claras = (total/2) + 1;
				oscuras = total/2;
			}else {
				claras = total/2;
				oscuras = total/2;
			}
			System.out.println(claras + " " + oscuras);
		}
		
		
	}
}
