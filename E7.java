import java.util.Scanner;
public class E7
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

    // Pedimos la nota del primer examen
      System.out.print ("Introduce la nota del primer examen: ");
    double notaPrimerExamen = scanner.nextDouble ();

    // Pedimos la nota deseada para el trimestre
      System.out.print ("¿Qué nota quieres sacar en el trimestre? ");
    double notaDeseadaTrimestre = scanner.nextDouble ();

    // Calculamos la nota necesaria en el segundo examen
    double notaNecesariaSegundoExamen =
      (notaDeseadaTrimestre - (0.4 * notaPrimerExamen)) / 0.6;

    // Mostramos el resultado por pantalla
      System.out.println ("Para tener un " + notaDeseadaTrimestre +
			  " en el trimestre necesitas sacar un " +
			  notaNecesariaSegundoExamen +
			  " en el segundo examen.");
  }
}