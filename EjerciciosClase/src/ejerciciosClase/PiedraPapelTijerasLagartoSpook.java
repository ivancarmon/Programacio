package ejerciciosClase;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijerasLagartoSpook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("jugador1 introduce tu jugada(1.Piedra, 2.Tijeras, 3.Papel, 4.Lagarto, 5.Spook):");
		int j1 = sc.nextInt();
		int j2 = r.nextInt(5) + 1;
		switch(j1) {
		case 1:
			if (j2 == 2) {
				System.out.println("Has ganado");
			}else if (j2 == 3) {
				System.out.println("Has perdido");
			}else if (j2 == 4) {
				System.out.println("Has ganado");
			}else {
				System.out.println("Has perdido");
			}
			break;
		case 2:
			if (j2 == 1) {
				System.out.println("Has perdido");
			}else if (j2 == 3) {
				System.out.println("Has ganado");
			}else if (j2 == 4) {
				System.out.println("Has ganado");
			}else {
				System.out.println("Has perdido");
			}
			break;
		case 3:
			if (j2 == 1) {
				System.out.println("Has ganado");
			}else if (j2 == 2) {
				System.out.println("Has perdido");
			}else if (j2 == 4) {
				System.out.println("Has perdido");
			}else {
				System.out.println("Has ganado");
			}
		case 4:
			if (j2 == 1) {
				System.out.println("");
			}
		}
	}

}
