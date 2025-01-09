package examens;

import java.util.Scanner;

public class Examen2020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar;
		String sexo;
		double alturaM;
		String nombreM;
		String apellidosM;
		int edadM;
		double alturaF;
		String nombreF;
		String apellidosF;
		int edadF;

		do {
			System.out.println("Introduce tu sexo: ");
			sexo = sc.nextLine();
			if(sexo.equalsIgnoreCase("hombre")) {
				System.out.println("Introduce tu altura: ");
				alturaM = sc.nextDouble();
				System.out.println("Introduce tu edad: ");
				edadM = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce tu nombre: ");
				nombreM = sc.nextLine();
				System.out.println("Introduce tu apellido: ");
				apellidosM = sc.nextLine();
				System.out.println("Introduce tu altura: ");
				alturaF = sc.nextDouble();
				System.out.println("Introduce tu edad: ");
				edadF = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce tu nombre: ");
				nombreF = sc.nextLine();
				System.out.println("Introduce tu apellido: ");
				apellidosF = sc.nextLine();
			}else {
				System.out.println("Introduce tu altura: ");
				alturaF = sc.nextDouble();
				System.out.println("Introduce tu edad: ");
				edadF = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce tu nombre: ");
				nombreF = sc.nextLine();
				System.out.println("Introduce tu apellido: ");
				apellidosF = sc.nextLine();
				System.out.println("Introduce tu altura: ");
				alturaM = sc.nextDouble();
				System.out.println("Introduce tu edad: ");
				edadM = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce tu nombre: ");
				nombreM = sc.nextLine();
				System.out.println("Introduce tu apellido: ");
				apellidosM = sc.nextLine();
			}

			System.out.printf("%40s \t \t %s \n", "Hombre", "Mujer");
			for (int i = 0; i < 79;i++) {
				System.out.print("-");
			}
			System.out.printf("\n%-33s %2d %22d\n" , "Edad:", edadM , edadF );
			System.out.printf("%-33s %-22s %-22s\n" , "Nombre:", nombreM , nombreF );
			System.out.printf("%-33s %-22s %-22s\n" , "Apellidos:", apellidosM , apellidosF );
			System.out.printf("%-33s %-22s %-22s\n" , "Altura:", alturaM , alturaF );
			System.out.println("Desea introducir nuevos datos?S/N");
			continuar = sc.nextLine();
		}
		while(continuar.equalsIgnoreCase("S"));
	}
}
