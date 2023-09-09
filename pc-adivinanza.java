import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Piensa en un número entre 1 y 100.");
        System.out.println("Presiona Enter cuando estés listo para empezar");
        scanner.nextLine();
        
        int menor = 1;
        int mayor = 100;
        int intentos = 0;
        
        while (true) {
            int intento = (menor + mayor) / 2;
            intentos++;
            
            System.out.print("¿Es " + intento + " tu número? Ingresa '<' si es menor, '>' si es mayor, o '=' si es correcto: ");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equals("=")) {
                System.out.println("¡Adiviné tu número " + intento + " en " + intentos + " intentos!");
                break;
            } else if (respuesta.equals("<")) {
                mayor = intento - 1;
            } else if (respuesta.equals(">")) {
                menor = intento + 1;
            } else {
                System.out.println("Por favor, ingresa '<', '>', o '=' para responder.");
            }
        }
        
        scanner.close();
    }
}
