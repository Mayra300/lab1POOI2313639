/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class S1_Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número A
        System.out.println("Ingresa un primer número");
        int numA = 0;
        numA = scanner.nextInt();
        // Solicitar al usuario ingresar un número B
        System.out.println("Ingresa un segundo número");
        int numB = 0;
        numB = scanner.nextInt();

        if (numA > 0 && numB > 0) {// Verificamos si los números A y B son mayores a 0 al mismo tiempo
            System.out.println("true");
        }
    }
}
