package blackjack;

import java.util.Random;
import java.util.Scanner;

public class Blackjack1 {
	
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
				
				bank += juego(apuesta);
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
			System.out.println("Vuelva a introducir la cantidad:");
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
	public static double juego(double apuesta) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int dealercards = 0;
		int playercards = 0;
		int opcion;
		int cont = 0;
		
		int carta;
		dealercards += pedirCarta(dealercards);
		System.out.printf("Cartas del dealer: %d X %n%n", dealercards);
		playercards += pedirCarta(playercards);
		playercards += pedirCarta(playercards);
		System.out.printf("Cartas del jugador: %d %n",playercards);
		if(comprobarBlackJack(playercards)) {
			System.out.println("Has obtenido blackjack ganas directamente");
			apuesta *= 1.5;
			return apuesta;
		}
		//programando el menu del jugador
		do {
			System.out.println("1- doblar apuesta");
			System.out.println("2- plantarse");
			System.out.println("3- pedir otra carta");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				apuesta *= 2;
				playercards += pedirCarta(playercards);
				System.out.println("Cartas del jugador: " + playercards);
				if (playercards > 21) {
					System.out.print("¡Te has pasado!");
						hasPerdido(apuesta);
					
				}
				break;

			case 2:break;
			case 3:
				playercards += pedirCarta(playercards);
				System.out.println("Cartas del jugador: " + playercards);
				System.out.println();
				if (playercards > 21) {
					
					System.out.print("¡Te has pasado!");
					hasPerdido(apuesta);
					
				}
			}
		} while (opcion == 3);
		//programar la maquina
		while(dealercards < 17){
			dealercards += pedirCarta(dealercards);
			System.out.printf("Cartas del dealer: %d%n", dealercards);
			System.out.printf("Cartas del jugador: %d%n", playercards);
			
			if(dealercards > 21){
				
				System.out.println("El dealer se ha pasado,¡Has ganado!");
				return apuesta;
			}
			
		}
		
		if (playercards > dealercards) {
			
			System.out.println("Has ganado");
			return apuesta;
			
		} else if(dealercards > playercards){
			System.out.println("Has perdido");
			apuesta -= apuesta *2;
			return apuesta;
		}
		else {
			System.out.println("Has empatado");
			return 0;
		}
		
		
		
		
		
		
		
		
		

		
	}
	public static boolean comprobarBlackJack(int playercards) {
		boolean esBlackJack;
		esBlackJack = (playercards == 21);

		
		return esBlackJack;
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
	public static double hasPerdido(double apuesta) {
		System.out.println("¡has perdido!");
		apuesta -= apuesta *2;
		return apuesta;
	}
	
}
