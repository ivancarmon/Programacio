import java.util.Scanner;

public class AnillamientoAlbufera {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casos;
		int anilladas,poranillar,result = 0;
		
		while(true){
			casos = sc.nextInt();sc.nextLine();
			if(casos == 0) {
				break;
			}
			for (int i = 0; i < casos; i++) {
				anilladas = sc.nextInt();
				poranillar = sc.nextInt();
				result += SacarResultado(anilladas,poranillar);
			}
			System.out.println(result);
			result = 0;

		}
	}
	public static int SacarResultado(int anilladas,int poranillar) {
		
		int result;
		result = anilladas - poranillar;
		
		
		
		return result;
	}
}
