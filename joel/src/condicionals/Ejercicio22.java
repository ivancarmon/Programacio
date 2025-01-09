package condicionals;

import java.util.Scanner;
public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Moment;
		int A = sc.nextInt();
		int dia = A/86400;
		dia++;
		int moment = A/43200;
		if (moment % 2 == 0) {
			Moment = "mati";
		} else {
			Moment = "nit";
		}
		System.out.println(Moment + " del dia " + dia);
		
	}
}