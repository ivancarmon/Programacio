import java.util.Scanner;

public class Momentobanana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		int dany;
		int salud;
		int percentatge;
		for (int i = 0; i < casos; i++) {
			salud = sc.nextInt();
			dany = sc.nextInt();
			if (dany>20%salud && dany<salud) {
				System.out.println("Momento Banana");
			}else {
				System.out.println("Nope");
			}
		}
		sc.close();
	}
}
