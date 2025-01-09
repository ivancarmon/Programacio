package ejercicios;
import java.util.Random;
public class Ejercicio3 {
	public static void main(String[] args) {
		Random rand= new Random();
		int Alejandro;
		int Ana;
		do {
		Alejandro= rand.nextInt(6) + 35;
		Ana = rand.nextInt(6) + 35;
		}
		while(Alejandro == Ana);
		System.out.printf("%-22s %2d\n", "Número de Alejandro:", Alejandro );
		System.out.printf("%-22s %2d\n", "Número de Ana:", Ana );
		if (Alejandro > Ana) {
			System.out.println("Gana Alejandro!");
		}else {
			System.out.println("Gana Ana!");
		}
		
	}
}
