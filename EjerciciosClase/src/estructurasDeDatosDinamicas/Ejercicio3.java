package estructurasDeDatosDinamicas;

import java.util.ArrayList;

public class Ejercicio3	{
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("pau");
		nombres.add("Jaume");
		nombres.add("Jaime");
		nombres.add("Joan");
		nombres.add("Jordi");
		nombres.add("Cristian");
		for (String string : nombres) {
			System.out.printf("%-25s",string);
			if(nombres.indexOf(string) % 3 == 2) {
				System.out.println();
			}
		}
	}

}
