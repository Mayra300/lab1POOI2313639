/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



import java.util.Scanner;

public class S1_Ejercicio5 {

    public static void main(String[] args) {

        // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número del 1 al 7
        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();

        // Usar la sentencia switch para imprimir el día de la semana correspondiente al número
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número fuera de rango. Ingresa un número del 1 al 7.");
        }


    }
}
