import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numP = 0;
        int numN = 0;

        while (true) {
            System.out.print("Ingrese un valor entero (0 para terminar): ");
            int valor = scanner.nextInt();

            if (valor == 0) {
                break;
            } else if (valor > 0) {
                numP++;
            } else {
                numN++;
            }
        }

        System.out.println("Gráfico de valores positivos:");
        for (int i = 0; i < numP; i++) {
            System.out.print("*");
        }

        System.out.println("\n Gráfico de valores negativos:");
        for (int i = 0; i < numN; i++) {
            System.out.print("*");
        }

        scanner.close();
    }
}
