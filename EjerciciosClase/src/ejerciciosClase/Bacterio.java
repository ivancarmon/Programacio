package ejerciciosClase;

import java.util.Scanner;

public class Bacterio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de alumnos");
		int alumnos = sc.nextInt();
		double nota;
		int brillantes = 0;
		int aprobados = 0;
		int condicionados = 0;
		int suspensos = 0;
		int cazurros = 0;
		for (int i = 0; i < alumnos; i++) {
			
			nota = sc.nextDouble();
			if (nota > 10 || nota < 0) {
				System.out.println("nota no valida");
				i--;
			}
			if (nota >= 9) {
				brillantes++;
			}else if(nota >= 5){
				aprobados++;
			}else if(nota >= 4 && nota < 5) {
				condicionados++;
			}else if(nota < 4 && nota > 0) {
				suspensos++;
			}else if(nota == 0){
				cazurros++;
			}
		}
		System.out.printf("%d alumno/s brillantes\n", brillantes);
		System.out.printf("%d alumno/s aprobados\n", aprobados);
		System.out.printf("%d alumno/s condicionados\n", condicionados);
		System.out.printf("%d alumno/s suspensos\n", suspensos);
		System.out.printf("%d alumno/s cazurros\n", cazurros);
		
	}
}
