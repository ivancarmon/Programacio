package estructurasDeDatosDinamicas;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int tamano = rand.nextInt(11) + 10;
		for (int i = 0; i < tamano; i++) {
			list.add(rand.nextInt(101));
			
			
		}
		System.out.println(list);
	}
}
