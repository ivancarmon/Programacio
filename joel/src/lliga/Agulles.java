package lliga;

import java.util.Scanner;

public class Agulles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String h = x.substring(0 , 2);
		String m = x.substring(3);
		int hora = Integer.parseInt(h);
		int minuts = Integer.parseInt(m);
		double grausmin = hora * 60 + minuts * 6;
		double graush = (hora * 30) + (minuts * 0.5);
		grausmin %= 360;
		graush %= 360;
		if (grausmin == graush) {
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}

	}
}

