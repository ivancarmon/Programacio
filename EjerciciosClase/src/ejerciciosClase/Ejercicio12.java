package ejerciciosClase;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int cont = 10;
		int limite = 20;
		
		
		boolean a = ((cont == 0) && (limite < 20));
		System.out.println(a);
		
		boolean b = (limite >= 20) || (cont < 5);
		System.out.println(b);
		
		// dona excepcio perque no es pot dividir entre 0
		//boolean c = ((limite/(cont-10)) > 7) || (limite < 20);
		
		//no dona error perque es un or y com el primer es vertader no comproba la segona
		boolean d = (limite<=20) || ((limite/(cont-10)) > 7);
		System.out.println(d);
		
		
		//no es pot dividir entre cero altra vegada
		//boolean e = ((limite/(cont-10)) > 7) && (limite < 0);
		//System.out.println(e);
		
		/*per el mateix de antes perque si la primera dona falsa no fa la segona 
		 * si la primera fora vertadera si faria la segona
		 */
		boolean f = (limite < 0) && ((limite/(cont-10)) > 7);
		System.out.println(f);
		
		
		
	}
}
