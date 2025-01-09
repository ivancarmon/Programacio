package examens;

import java.util.Scanner;

public class Horaexamen2020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la hora:");
		String hora = sc.nextLine();
		int hh;
		int mm;
		while(hora.length()!= 5) {
			System.out.println("Introduzca de nuevo, formato no valido:");
			hora = sc.nextLine();
		}
		if (hora.equals("00:00")) {
			System.out.println("12:00 A.M. (midnight)");
		}else if(hora.equals("12:00")) {
			System.out.println("12:00 P.M. (midday)");
		}
		else {
			hh = Integer.parseInt(hora.substring(0,2));
			mm = Integer.parseInt(hora.substring(3));
			if(hh < 12) {
				if(hh == 0) {
					hh = 12;
				}
				System.out.printf("%02d:%02d A.M.", hh, mm);
			}else if(hh > 12){
				hh -= 12;
				System.out.printf("%02d:%02d P.M.", hh, mm);
			}else {
				System.out.printf("%02d:%02d P.M.", hh, mm);
			}
		}
		
		
		sc.close();
	}
}
