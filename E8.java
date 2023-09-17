import java.util.Scanner;
public class E8
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    // Pedir la hora por teclado
      System.out.print ("Introduce la hora (solo hora): ");
    int hora = scanner.nextInt ();

    // Comprobar el rango de horas y mostrar el saludo apropiado
    if (hora >= 6 && hora <= 12)
      {
	System.out.println ("Buenos días");
      }
    else if (hora >= 13 && hora <= 20)
      {
	System.out.println ("Buenas tardes");
      }
   else if (hora >= 20&& hora <= 24)
      {
	System.out.println ("Buenas noches");
      }
  }
}