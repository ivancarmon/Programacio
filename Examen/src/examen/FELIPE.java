package examen;

import java.util.Scanner;

public class FELIPE {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Variable donde se guarda la opción del usuario
		int opcion;		

		boolean continuar = true;

		//Bucle hasta pulsar 9
		while (continuar) {

			//Mostrar por pantalla el menú
			System.out.printf("\n1.- Opción 1");
//			System.out.printf("\n2.- Opción 2");
//			System.out.printf("\n3.- Opción 3");
//			System.out.printf("\n4.- Opción 4");
			System.out.printf("\n\n9.- Salir");
			System.out.printf("\n\nOpcion: ");

			//Leer la opción escogida por el usuario
			opcion = sc.nextInt();

			switch(opcion){
			case 1: {
				TOT();
			}
			
				        
			case 2: {
				System.out.println("\nHas escogido la opción 2");
				break;
			}
			case 3: {
				System.out.println("\nHas escogido la opción 3");				
				break;
			}
			case 4: {
				System.out.println("\nHas escogido la opción 4");				
				break;
			}
			case 9: {
				System.out.println("\nFIN del programa");				
				continuar = false;
				break;
			}
			default: {
				System.out.printf("\n\nOpción incorrecta\n");
				break;
			}
			}
		}
		
		sc.close();
	}
	public static void TOT() {
		Scanner sc = new Scanner(System.in);

        int n1 = 0;
        char simbolo;

        System.out.println("Introduce el símbolo que quieras: ");
        simbolo = sc.next().charAt(0);
        do {
            System.out.println("Introduce el tamaño: ");
            n1 = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
		} while (n1<5 || n1 % 2 == 0);


        System.out.println("Introduce el número: ");
        String numero = sc.nextLine(); // Leemos el número como una cadena
        
        // Dibujar cada dígito del número
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < numero.length(); j++) {
                // Llamar a la función para cada dígito y dibujarlo
                dibujarNumero(numero.charAt(j), i, n1, simbolo);
                System.out.print("   "); // Separador entre los números
            }
            System.out.println(); // Nueva línea después de imprimir una fila
        }
    }

    // Función para dibujar el número (0-9) dependiendo de la fila i
    public static void dibujarNumero(char num, int i, int n, char simbolo) {
        switch (num) {
            case '0':
                dibujar0(i, n, simbolo);
                break;
            case '1':
                dibujar1(i, n, simbolo);
                break;
            case '2':
                dibujar2(i, n, simbolo);
                break;
            case '3':
                dibujar3(i, n, simbolo);
                break;
            case '4':
                dibujar4(i, n, simbolo);
                break;
            case '5':
                dibujar5(i, n, simbolo);
                break;
            case '6':
                dibujar6(i, n, simbolo);
                break;
            case '7':
                dibujar7(i, n, simbolo);
                break;
            case '8':
                dibujar8(i, n, simbolo);
                break;
            case '9':
                dibujar9(i, n, simbolo);
                break;
        }
    }

    // Funciones para dibujar cada número del 0 al 9 (cada una dibuja una línea específica)
    public static void dibujar0(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar1(int i, int n, char simbolo) {

            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    




    public static void dibujar2(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1 || i == n / 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else if (i < n / 2) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar3(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1 || i == n / 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar4(int i, int n, char simbolo) {
        if (i == n / 2) {
            // Línea horizontal en el centro
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else {
            // Imprime solo la columna derecha del 4
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo); // Imprime solo la columna derecha
                } else if (i < n / 2 && j == 0) {
                    System.out.print(simbolo); // Imprime solo la columna izquierda en la parte superior
                } else {
                    System.out.print(" "); // Resto de la fila vacía
                }
            }
        }
    }


    public static void dibujar5(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1 || i == n / 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else if (i < n / 2) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar6(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1 || i == n / 2) {
            // Parte superior, media e inferior
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else if (i < n / 2) {
            // Parte superior inclinada: columna izquierda
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print(simbolo); // Parte izquierda del 6
                } else {
                    System.out.print(" ");
                }
            }
        } else {
            // Parte inferior inclinada: columna izquierda
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print(simbolo); // Parte izquierda del 6
                } else if (j == n - 1) {
                    System.out.print(simbolo); // Parte derecha del 6
                } else {
                    System.out.print(" ");
                }
            }
        }
    }


    public static void dibujar7(int i, int n, char simbolo) {
        if (i == 0) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar8(int i, int n, char simbolo) {
        if (i == 0 || i == n - 1 || i == n / 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        } else {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void dibujar9(int i, int n, char simbolo) {
        if (i == 0 || i == n / 2) {
            for (int j = 0; j < n; j++) {
                System.out.print(simbolo);
            }
        }else if(i < n/2) {
        	for (int j = 0; j < n; j++) {
				if(j==0||j == n-1) {
					System.out.print(simbolo);
				}
				else {
					System.out.print(" ");
				}
			}
        }
        else {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) {
                    System.out.print(simbolo);
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
	


}