import java.util.Scanner;
public class E9
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    // Pedimos el número de horas trabajadas
      System.out.print ("Introduce el número de horas trabajadas: ");
    int horasTrabajadas = scanner.nextInt ();

    // Definimos la tarifa por hora para las horas ordinarias y extras
    double tarifaOrdinaria = 12.0;	// 12 soles por hora ordinaria
    double tarifaExtra = 16.0;	// 16 soles por hora extra

    // Calculamos el salario semanal
    double salario;

    if (horasTrabajadas <= 40)
      {
	salario = horasTrabajadas * tarifaOrdinaria;
      }
    else
      {
	int horasOrdinarias = 40;
	int horasExtras = horasTrabajadas - 40;
	salario =
	  (horasOrdinarias * tarifaOrdinaria) + (horasExtras * tarifaExtra);
      }

    // Mostrar el salario por pantalla
    System.out.println ("El salario semanal del trabajador es: " +
			salario + " soles");
  }
}
