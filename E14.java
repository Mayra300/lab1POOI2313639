
import java.util.Scanner;

public class E14
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.print("Introduce el día (1:Lunes, 2:Martes, ..., 5:Viernes): ");
    int diaSemana = sc.nextInt ();
      System.out.print ("Introduce la hora (0-23): ");
    int horas = sc.nextInt ();
      System.out.print ("Introduce los minutos (0-59): ");
    int minutos = sc.nextInt ();

    int minutosHastaFinDeSemana =
      ((5 - diaSemana) * 24 * 60) + ((15 - horas) * 60) - ( minutos);

      System.out.println ("Minutos hasta el fin de semana: " +
			  minutosHastaFinDeSemana);

  }
}
