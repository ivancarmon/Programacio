package estructurasDeDatosDinamicas;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VotacionDelegado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int votos;
		int maxVotos = 0;
		String s = "",alumno,ganador = "";
		Map<String, Integer> votacion = new HashMap<String, Integer>();
		ArrayList<String> ganadores = new ArrayList<String>();
		while(!s.equals("fin")) {
			System.out.println("introduce tu voto:");
			s = sc.nextLine();
			votacion.put(s, votacion.containsKey(s) ? votacion.get(s) + 1 : 1);
			
			votacion.remove("fin");
		}
		for (Entry<String, Integer> mentry : votacion.entrySet()) {
			alumno = (String) mentry.getKey();
			votos = (int) mentry.getValue();
			System.out.printf("%10s: %4d votos%n",alumno,votos);
			if(votos > maxVotos) {
				ganador = alumno;
				maxVotos = votos;
				ganadores.clear();
				ganadores.add(ganador);
			}
			else if(votos == maxVotos) {
				ganador = alumno;
				ganadores.add(ganador);
			}
		}
		String res = ganadores.toString();
		res = res.replace("[", "");
		res = res.replace("]", "");
		if(ganadores.size() > 1) System.out.println("hay empate entre " + res);
		else System.out.println("el ganador es " + ganador);
		sc.close();
	}
}
