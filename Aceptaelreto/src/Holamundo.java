import java.util.Scanner;

public class Holamundo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		for(int i = 0;i < casos;i++) {
			System.out.println("Hola mundo.");
		}
		sc.close();
	}
}
