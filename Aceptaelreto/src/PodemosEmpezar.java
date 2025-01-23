import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PodemosEmpezar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p,l,a;
		Set<String> vecinos = new HashSet<String>();
		String s;
		while(true) {
			vecinos.clear();
			p = sc.nextInt();
			l = sc.nextInt();
			a = sc.nextInt();sc.nextLine();
			if(p == 0 && l== 0 && a == 0) break;
			for (int i = 0; i < a; i++) {
				
				s = sc.next() + sc.next();
				vecinos.add(s);
			}
			if(p*l % 2 == 0) System.out.println(vecinos.size() >= (p*l) / 2 ? "EMPEZAMOS":"ESPERAMOS");
			else System.out.println(vecinos.size() > (p*l) / 2 ? "EMPEZAMOS":"ESPERAMOS");
		}
		sc.close();
	}
}
