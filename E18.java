import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int limite = sc.nextInt();
        System.out.print("Introduce el número por el cual no deben ser divisibles: ");
        int divisor = sc.nextInt();
        
        for (int i = 1; i < limite; i++) {
            if (i % divisor != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
