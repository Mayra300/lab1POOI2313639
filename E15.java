import java.util.Scanner;

public class E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion = 1234; // Combinación de la caja fuerte
        int intentos = 4;
        
        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int entrada = sc.nextInt();
            
            if (entrada == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
                intentos--;
            }
        }
        
        if (intentos == 0) {
            System.out.println("Has agotado tus intentos. La caja fuerte permanece cerrada.");
        }
    }
}
