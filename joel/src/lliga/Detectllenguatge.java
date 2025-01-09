package lliga;

import java.util.Scanner;

public class Detectllenguatge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String E = sc.nextLine().toLowerCase();
		if (E.equals("adios")) {
			System.out.println("ES");
		}else if (E.equals("good bye")) {
			System.out.println("UK");
		}else if (E.equals("au revoir")) {
			System.out.println("FR");
		}else if (E.equals("ciao")) {
			System.out.println("IT");
		}else if (E.equals("doei")) {
			System.out.println("NL");
		}else if (E.equals("tschuss")){
			System.out.println("DE");
		}else {
			System.out.println("??");
		}
	}
}
