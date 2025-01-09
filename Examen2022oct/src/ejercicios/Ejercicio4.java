package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar;
		do {
			System.out.println("Dime el nombre de la asignatura:");
			String asignatura = sc.nextLine();
			System.out.println("Dime la nota que te gustaría sacar en este trimestre:");
			int notadeseada = sc.nextInt();sc.nextLine();
			System.out.println("Dime tu nombre:");
			String alumno = sc.nextLine(); 
			System.out.println("Dime la nota real del primer examen:");
			double primerexamen = sc.nextDouble();
			System.out.println("Dime la nota real del segundo examen:");
			double segundoexamen = sc.nextDouble();sc.nextLine();
			double media = (primerexamen * 0.4) + (segundoexamen * 0.6);
			String nota;
			if (notadeseada < 5) {
				nota = "(Insuficiente)";
			}else if (notadeseada == 5) {
				nota = "(Suficiente)";
			}else if(notadeseada == 6) {
				nota = "(Bien)";
			}else if(notadeseada == 7 || notadeseada == 8) {
				nota = "(Notable)";
			}else {
				nota = "(Excelente)";
			}
			System.out.printf("\n%-22s", "Alumno:");
			System.out.print(alumno);
			System.out.printf("\n%-22s", "Asignatura:");
			System.out.print(asignatura);
			System.out.printf("\n%-22s", "Nota deseada:");
			System.out.print(notadeseada + " " + nota);
			System.out.printf("\n%-22s", "Nota 1r examen (40%):");
			System.out.printf("%4.2f",primerexamen);
			System.out.printf("\n%-22s", "Nota 2n examen (60%):");
			System.out.printf("%4.2f",segundoexamen);
			System.out.printf("\n%-22s", "Nota media:");
			System.out.printf("%4.2f",media);
			if (media > notadeseada) {
				System.out.println("\n\nMuy bien! Reto conseguido!\n");
			}else {
				System.out.println("\n\nDebes seguir esforzandote\n");
			}
			System.out.println("¿Quieres obtener la nota media de otra asignatura? (s/n))");
			continuar = sc.nextLine();
		}
		while(continuar.equalsIgnoreCase("s"));
		System.out.println("¡HASTA PRONTO!");
	}
}
