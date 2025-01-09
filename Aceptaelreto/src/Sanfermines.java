import java.util.Scanner;

public class Sanfermines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos;
		int velmax = 0;
		int velocidad;
		while (sc.hasNext()) {
			velmax = 0;
			casos = sc.nextInt();
			for(int i = 0;i < casos;i++) {
				velocidad = sc.nextInt();
				if (velocidad > velmax) {
					velmax = velocidad;
				}
			}
			System.out.println(velmax);
			
		}

		sc.close();
	}

}
