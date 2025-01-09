package funcions;

public class imprimircajadetexto {
	public static void main(String[] args) {
		String s = "natacha y el pato";
		int n = s.length();
		ImrpimirCajaDeTexto(s, n);
	}
	public static void ImrpimirCajaDeTexto(String s,int n) {
		BaseYPrimeraLinea(n);
		lineasCentrales(n);
		lineaDeTexto(s);
		lineasCentrales(n);
		BaseYPrimeraLinea(n);
	}
	public static void BaseYPrimeraLinea(int n) {
		for (int i = 0; i < n + 4; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void lineasCentrales(int n){
		n = n + 3;
		String formato = "%-" + n + "s*\n";
		System.out.printf(formato ,"*");
	}
	public static void lineaDeTexto(String s){
		System.out.printf("%-2s%s *\n" ,"*",s);
	}
}
