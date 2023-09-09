import java.util.Random;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Generar un número aleatorio entre 0 y 100
        int intentos = 0;
        boolean adivinado = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinanza de números!");

        while (!adivinado) {
            try {
                System.out.print("Adivina el número entre 0 y 100: ");
                int intento = scanner.nextInt();
                intentos++;

                if (intento < numeroSecreto) {
                    System.out.println("El número secreto es mayor. Intenta de nuevo.");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número secreto es menor. Intenta de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número secreto " + numeroSecreto + " en " + intentos + " intentos.");
                    adivinado = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ingresa un número válido.");
                scanner.next(); // Limpia el búfer del scanner
            }
        }

        scanner.close();
    }
}
