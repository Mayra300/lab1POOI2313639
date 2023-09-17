import java.util.Scanner;
public class E12
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    // Pedimos al usuario que introduzca un número
      System.out.print ("Introduce un número entero: ");
    int numero = scanner.nextInt ();

    // Verificamos si el número es par
    if (numero % 2 == 0)
      {
	System.out.println (numero + " es un número par.");
      }
    else
      {
	System.out.println (numero + " no es un número par.");
      }

    // Verificamos si el número es divisible entre 5
    if (numero % 5 == 0)
      {
	System.out.println (numero + " es divisible entre 5.");
      }
    else
      {
	System.out.println (numero + " no es divisible entre 5.");
      }
  }
}
