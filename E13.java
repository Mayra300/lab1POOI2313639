import java.util.Scanner;
public class E13
{
  public static void main (String[]args)
  {

    Scanner scanner = new Scanner (System.in);

      System.out.print
      ("Ingresa un número entero (positivo o negativo) ");

    int numero = scanner.nextInt ();

    // Tomar el valor absoluto para manejar números negativos
    numero = Math.abs (numero);

    // Inicializar una variable para contar los dígitos
    int contador = 0;

    // Utilizar divisiones sucesivas para contar los dígitos
    while (numero > 0)
      {
	numero = numero / 10;
	contador++;
      }

    // Imprimir el resultado
    System.out.println ("El número tiene " + contador + " dígitos.");

  }

}
