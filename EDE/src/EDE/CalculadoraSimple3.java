package EDE;

public class CalculadoraSimple3 {

    public static void main(String[] args) {
        // Declaración de variables
        int numero1 = 10;
        int numero2 = 5;

        // Suma
        int suma = numero1 + numero2;
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);

        // División
        int division = numero1 / numero2;
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);

        // Operación compleja
        int operacionCompleja = (numero1 + numero2) * (numero1 - numero2);
        System.out.println("Operación compleja: (" + numero1 + " + " + numero2 + ") * (" + numero1 + " - " + numero2 + ") = " + operacionCompleja);
    }
}