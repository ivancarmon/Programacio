package examen2024;

import java.util.Scanner;

public class Lluvias {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String provincia,ciudad,hora,minutos,clasificacion;
		int horaslloviendo,horas;
		double litrosaux = 0,litros = 0,media;
		System.out.println("Nombre de la Provincia:");
		provincia = sc.nextLine();
		System.out.println("Nombre de la Ciudad:");
		ciudad = sc.nextLine();
		System.out.println("¿Cuántas horas ha llovido?");
		horaslloviendo = sc.nextInt();sc.nextLine();
		System.out.println("¿a que hora ha empezado a llover? (hh:mm)");
		hora = sc.nextLine();
		String[] partes = hora.split(":");
		horas = Integer.parseInt(partes[0]);
		minutos = partes[1];
		for (int i = 0; i < horaslloviendo; i++) {
			if (horas >= 24) {
				horas -= 24;
			}
			if (horas == 23) {
				System.out.printf("¿Cuántos litros han llovido de las %d:%s a las %s:%s?%n", horas,minutos, "00",minutos);
				litrosaux = sc.nextDouble();
			}
			else {
				System.out.printf("¿Cuántos litros han llovido de las %d:%s a las %d:%s?%n", horas,minutos, horas + 1,minutos);
				litrosaux = sc.nextDouble();
			}
			litros += litrosaux;
			horas++;
		}
		System.out.println();
		media = litros / horaslloviendo;
		if (media <= 2 ) {
			clasificacion = "lluvias debiles";
		}
		else if(media> 2 && media<= 15){
			clasificacion = "lluvias moderadas";

		}
		else if(media > 15 && media <= 30){
			clasificacion = "lluvias fuertes";
		}
		else if (media > 30 && media <=60) {
			clasificacion = "lluvias muy fuertes";
		}
		else {
			clasificacion = "lluvias torrenciales";
		}

		System.out.printf("%-30s%s\n","Provincia:", provincia);
		System.out.printf("%-30s%s\n","Ciudad:", ciudad);
		System.out.printf("%-30s%.2f (mm/h)\n","Media:", media);
		System.out.printf("%-30s%s\n","Clasificacion:", clasificacion);
		sc.close();
	}
}
