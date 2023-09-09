import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese coordenadas del caballo.");
        System.out.print("Fila: ");
        int filaCaballo = scanner.nextInt();

        if (filaCaballo < 1 || filaCaballo > 8) {
            System.out.println("Posición inválida.");
            scanner.close();
            return;
        }

        System.out.print("Columna (1-8): ");
        int columnaCaballo = scanner.nextInt();

        if (columnaCaballo < 1 || columnaCaballo > 8) {
            System.out.println("Posición inválida.");
            scanner.close();
            return;
        }

        System.out.println("El caballo puede saltar a las siguientes posiciones:");

        int[] movimientosFilas = { 2, 2, 1, 1, -1, -1, -2, -2 };
        int[] movimientosColumnas = { 1, -1, 2, -2, 2, -2, 1, -1 };

        for (int i = 0; i < 8; i++) {
            int nuevaFila = filaCaballo + movimientosFilas[i];
            int nuevaColumna = columnaCaballo + movimientosColumnas[i];

            if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                System.out.print("(" + nuevaFila + ", " + nuevaColumna + ") ");
            }
        }

        scanner.close();

    }
}
