import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de datos a ingresar: ");
        int cantidadDatos = scanner.nextInt();

        if (cantidadDatos <= 0) {
            System.out.println("Debe ingresar al menos un dato.");
            return;
        }

        double suma = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= cantidadDatos; i++) {
            System.out.print("Ingrese el dato #" + i + ": ");
            String datoStr = scanner.next(); // Lee como una cadena de texto
            double dato;

            try {
                dato = Double.parseDouble(datoStr); // Convierte a double
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número decimal.");
                return;
            }

            suma += dato;

            if (dato < min) {
                min = dato;
            }

            if (dato > max) {
                max = dato;
            }
        }

        double promedio = suma / cantidadDatos;

        System.out.println("El rango de los datos ingresados es de " + min + " a " + max);
        System.out.println("El promedio de los datos ingresados es: " + promedio);

        scanner.close();
    }
}
