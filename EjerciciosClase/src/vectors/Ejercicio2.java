package vectors;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		int array[] = crearArrayDe100Pos();
		System.out.println(sumarArray(array));
		System.out.println(mediaArray(array, sumarArray(array)));
		
	}
	
	public static int[] crearArrayDe100Pos() {
		int array[] = new int[100];
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i + 1;
			
		}
		return array;
	}
	
	public static int sumarArray(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	public static double mediaArray(int array[], int suma) {
		double media = 0.0;
		media = suma / array.length;
		
		return media;
	}
	
}
