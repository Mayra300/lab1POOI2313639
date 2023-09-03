/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class S1_Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.println("Ingresa un número");
        int num = 0;
        num = entrada.nextInt();
        
        if (num > 0 && num % 2 != 0) {// Verificamos si el número es mayor a 0 e impar al mismo tiempo
            System.out.println("true");// si cumple las condiciones se imprime TRUE
        }
    }
}