import java.util.Scanner;

public class Lafiestaaburrido {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i < casos;i++) {
			String cadena = sc.nextLine();
			String nombre = cadena.substring(4);
			System.out.printf("Hola, %s. \n",nombre);
			
		}
		sc.close();
		
	}
}
