package condicionals;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int j1 = random.nextInt(3) + 1;
		System.out.println(j1);
		int j2 = (int) Math.random() * 3 + 1;
		System.out.println(j2);
		if (j1 <= 0 || j1 > 3) {
			System.out.println("ERROR");
		}else if (j2 <= 0 || j2 > 3 ) {
			System.out.println("ERROR");
		}else {
			if (j1 != j2) {
				switch (j1) {
				case 1:
					if (j2 == 3){
						System.out.println("Jugador1");
					}else {
						System.out.println("Jugador2");
					}
					break;
				case 2:
					if (j2 == 3){
						System.out.println("Jugador2");
					}else {
						System.out.println("Jugador1");
					}
					break;
				case 3:
					if (j2 == 2){
						System.out.println("Jugador1");
					}else {
						System.out.println("Jugador2");
					}
					break;
				}
			}else{
				System.out.println("Empat");
			}
		}
	}
}