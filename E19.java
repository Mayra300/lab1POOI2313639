import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la altura de la letra L: ");
        int altura = sc.nextInt();
        
        // Comprobamos que la altura es mayor o igual a 2
        if (altura < 2) {
            System.out.println("La altura debe ser mayor o igual a 2.");
        } else {
            // colocamos la parte vertical de la L
            for (int i = 1; i <= altura - 1; i++) {
                System.out.println("*");
            }
            
            // colocamos el lado horizontal de la L
            for (int i = 1; i <= altura / 2 + 1; i++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }
}
