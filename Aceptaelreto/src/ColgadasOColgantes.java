import java.util.Scanner;

public class ColgadasOColgantes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos = sc.nextInt();sc.nextLine();
		String palabra;
		for (int i = 0; i < casos; i++) {
			
			palabra = sc.nextLine();
			System.out.println(ComprobarPalabra(palabra));
			
		}

	}
	public static String ComprobarPalabra(String palabra) {
		
		if (palabra.equalsIgnoreCase("colgadas")) {
			return "Bien";
		}else{
			return "Mal";
		}
	}

}
