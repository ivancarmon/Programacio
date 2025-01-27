package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double apuesta;

		System.out.println("Bienvenido al blackjack el que mas se acerque a 21 sin pasarse gana.");
		System.out.println("¿Que le gustaria hacer?");
		int opcion;
		double bank = 0;
		do {
			System.out.printf("Su banca es de %.2f€%n", bank);
			System.out.println("1- Depositar");
			System.out.println("2- Retirar dinero");
			System.out.println("3- Jugar al blackjack");
			System.out.println("4- Salir");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1:
				bank += depositar();
				break;
			case 2:
				bank = retirar(bank);
				break;
			case 3:

				System.out.println("¿Cuanto quiere apostar?");
				apuesta = sc.nextDouble();			

				while(apuesta > bank) {
					System.out.println("No tiene suficientes creditos.¿Cuanto quiere apostar?");
					apuesta = sc.nextDouble();
				}

				bank += juego(apuesta,bank);
				break;

			case 4:
				System.out.println("Adios.¡Hasta pronto!");
				System.exit(0);
				break;

			}
		} while (opcion!=4);





	}
	public static double depositar() {					
		double deposito;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto quieres depositar? (minimo 1 maximo 1000)");
		deposito = sc.nextDouble();

		while (deposito < 1 || deposito > 1000) {

			System.out.println("Cantidad no valida");
			System.out.println("Vuelva a 20introducir la cantidad:");
			deposito = sc.nextDouble();

		}
		return deposito;
	}
	public static double retirar(double bank) {
		double retiro;
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuanto quieres retirar?");
		retiro = sc.nextDouble();

		while (bank < retiro) {
			System.out.println("No puede retirar mas dinero que el que tiene");
			System.out.println("¿Cuanto quieres retirar?");
			retiro = sc.nextDouble();
		}

		bank -= retiro;

		return bank;
	}
	public static void ImprimirMatriz(int[][] m) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}

			System.out.println();
		}					

	}
	public static double juego(double apuesta,double bank) {
		boolean seguro = false;
		String seg;
		double aps = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int dealercards = 0;
		int playercards = 0;
		int opcion;
		int cont = 0;

		int carta;
		dealercards += pedirCarta(dealercards);
		dealercards = 11;
		System.out.printf("Cartas del dealer: %d X %n%n", dealercards);
		playercards += pedirCarta(playercards);
		playercards += pedirCarta(playercards);
		System.out.printf("Cartas del jugador: %d %n",playercards);

		if(playercards == 21) {

			System.out.println("Has obtenido blackjack ganas directamente");
			apuesta *= 1.5;
			return apuesta;

		}

		if(dealercards == 10 || dealercards == 11 ) {

			System.out.println("¿Desea apostar por seguro?");
			seg = sc.nextLine();
			if(seg.equalsIgnoreCase("si")) {
				seguro = true;
				aps = sc.nextDouble();
				while(apuesta + aps > bank ) {
					System.out.println("No tienes suficientes fondos:");
					System.out.println("¿Desea apostar por seguro?");
					seg = sc.nextLine();
				}


			}


		}

		do {

			if(cont == 0) {
				
				System.out.println("1- doblar apuesta");
				
			}

			System.out.println("2- plantarse");
			System.out.println("3- pedir otra carta");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				if(cont == 0 && apuesta *2 <= bank) {
					apuesta *= 2;
					playercards += pedirCarta(playercards);
					System.out.println("Cartas del jugador: " + playercards);
					if (playercards > 21) {
						System.out.println("Te has pasado de 21, ¡has perdido!");
						apuesta -= apuesta *2;
						return apuesta;

					}
				}
				else if(cont !=0){
					System.out.println("Opcion no valida despues de la primera ronda");
					opcion = 0;

				}
				else {
					if(apuesta *2 > bank) {

						System.out.println("No tienes fondos suficientes");
						opcion = 0;

					}
				}
				break;
			case 2:break;
			case 3:
				playercards += pedirCarta(playercards);
				System.out.println("Cartas del jugador: " + playercards);
				System.out.println();
				if (playercards > 21) {

					System.out.println("Te has pasado de 21, ¡has perdido!");
					apuesta -= apuesta *2;
					return apuesta;

				}
			}
			cont++;
		} while (opcion == 3 || opcion == 0);

		//programar la maquina
		cont = 0;
		while(dealercards < 17){

			dealercards += pedirCarta(dealercards);
			if(dealercards == 21 && cont == 0 && seguro) {
				if(aps == 0) {
					System.out.println("El dealer tenia blackjack ¡has perdido!");
					System.out.println("No has apostado por seguro");
				}
				else {

					System.out.println("Has apostado por seguro ganas esa apuesta pero pierdes la apuesta principal");

				}
				apuesta -= apuesta *2;
				apuesta += aps;
				System.out.println("El dealer tenia blackjack");
				return apuesta;


			}
			else if(dealercards < 21 && cont == 0) {

				aps -= aps * 2;


			}
			System.out.printf("Cartas del dealer: %d%n", dealercards);
			System.out.printf("Cartas del jugador: %d%n", playercards);

			if(dealercards > 21){
				
				System.out.println("El dealer se ha pasado,¡Has ganado!");
				return apuesta;
			}

			cont++;

		}
		if(!seguro) {
			if (playercards > dealercards) {

				System.out.println("Has ganado");
				return apuesta + aps;

			} else if(dealercards > playercards){
				System.out.println("Has perdido");
				apuesta -= apuesta *2 + aps;
				return apuesta;
			}
			else {
				System.out.println("Has empatado");
				return 0;
			}
		}


	}
	public static int pedirCarta(int totalcartas) {
		Random rand = new Random();
		int carta = rand.nextInt(13) + 1;
		if (carta > 10) {

			carta = 10;

		} else if(carta == 1){

			if(totalcartas + 11 <= 21) {
				carta = 11;  
			}
			else {
				carta = 1;
			}

		}

		return carta;

	}

}
