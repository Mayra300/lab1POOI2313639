import java.util.Scanner;
import java.lang.Math;
public class E10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la altura desde la que cae el objeto en metros
        System.out.print("Introduce la altura en metros desde la que cae el objeto: ");
        double h = scanner.nextDouble();

        // Asignamos el valor de la gravedad
        double g = 9.81;

        // Calculamos el tiempo de caída utilizando la fórmula
        double t = Math.sqrt((2 * h) / g);

        // Mostramos el tiempo de caída por pantalla
        System.out.println("El objeto tardará " + t + " segundos en caer desde una altura de " + h + " metros.");
    }
}