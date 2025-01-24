import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Potitos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s,aux;
		Set<String> ingSI = new HashSet<String>();
		Set<String> ingNo = new TreeSet<String>();
		while(true) {
			n = sc.nextInt();
			if( n == 0) break;
			for (int i = 0; i < n; i++) {
				aux = sc.next();
				while(!aux.equals("FIN")) {
					while(aux.equals("SI:")) {
						s = sc.next();
						if(s.equals("FIN")) {
							aux = "FIN";
							break;
						}
						if(!ingNo.add(s))ingNo.remove(s);
						ingSI.add(s);


					}
					while(aux.equals("NO:")) {
						s = sc.next();
						if(s.equals("FIN")) {
							aux = "FIN";
							break;
						}
						if(ingSI.add(s)) ingNo.add(s);


					}
				}

			}
			System.out.println(ingNo);
		}

		sc.close();
	}
}
