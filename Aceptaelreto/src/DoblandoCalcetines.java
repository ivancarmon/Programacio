import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoblandoCalcetines {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int max;
		int calcetin;
		Set<Integer> mesa = new HashSet<Integer>();
		while (true) {
			max = Integer.MIN_VALUE;
			n = sc.nextInt();
			if(n==0)break;			
			for (int i = 0; i < n; i++) {

				calcetin = sc.nextInt();
				if(!mesa.add(calcetin)) {
					mesa.remove((Integer) calcetin);
				}
				else {
					mesa.add(calcetin);
				}

				if(mesa.size() > max) max = mesa.size();

			}
			System.out.println(max);
		}
		
		
		
		
		
		sc.close();
	}

}
