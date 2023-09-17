import java.util.Scanner;

public class E11
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

      System.out.print ("Introduce la hora (0-23): ");
    int horas = sc.nextInt ();
      System.out.print ("Introduce los minutos (0-59): ");
    int minutos = sc.nextInt ();

    int segundosRestantes = (23 - horas) * 3600 + (60 - minutos) * 60;
      System.out.println ("Segundos hasta medianoche: " + segundosRestantes);

  }
}
