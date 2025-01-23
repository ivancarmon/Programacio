import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HaciendoInventario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		Set<String> invent = new HashSet<String>();
		while(true) {
			invent.clear();
			n = sc.nextInt();sc.nextLine();
			if(n==0)break;
			for (int i = 0; i < n; i++) {
				
				s = sc.nextLine().toLowerCase();
				invent.add(s);
				
			}
			
			System.out.println(invent.size());
		}
		sc.close();
	}
}
