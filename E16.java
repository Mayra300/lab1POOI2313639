import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

    }
}
