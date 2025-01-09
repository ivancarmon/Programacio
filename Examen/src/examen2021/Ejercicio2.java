package examen2021;

public class Ejercicio2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("KitKat");
			}else if(i % 3 == 0) {
				System.out.println("Kit");
			}else if (i % 5 == 0) {
				System.out.println("Kat");
			}else {
				System.out.println(i);
			}
		}
		
	}
}
