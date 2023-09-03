/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class S1_Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.println("Ingresa un número");
        int numA = 0;
        numA = scanner.nextInt();
        // Solicitar al usuario ingresar un número
        System.out.println("Ingresa un número");
        int numB = 0;
        numB = scanner.nextInt();
        // Verificamos si los números A y B son mayores o menores a 0 al mismo tiempo
        if ((numA > 0 && numB > 0) || (numA < 0 && numB < 0)) { 
            System.out.println("true");
        }
    }
}
