package funcions;

public class binari {
	public static void main(String[] args) {
		System.out.println(pasarBinari(43));
	}
	public static String pasarBinari(int n) {
		String res = "",resultat = "";
		if(n == 0) {
			return "0";
		}else {
		while(n/2>0) {
			res += n % 2;
			n /= 2;
		}
		res += 10;

	    for(int i = res.length()-1; i>=0; i--){
	        
	      resultat += res.charAt(i);
	      
	    }
		return resultat;
		}
	}
}
