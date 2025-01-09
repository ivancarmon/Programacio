package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numintentos = 0;
		String pass = "1234";
		Scanner sc = new Scanner(System.in);
		while (numintentos < 3) {
			String pass1 = sc.next();
			if (pass.equals(pass1)) {
				break;
			}else {
				System.out.println("Contraseña incorrecta");
				numintentos++;
			}
		}
	}

}
