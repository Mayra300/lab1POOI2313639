
public class E6
{
  public static void main (String[]args)
  {
    // Definimos  la cantidad en Megabytes
    double megabytes = 5.0;	

    // Definimos  la constante de conversion de MB a KB
    double conversion = 1024.0;	// 1 MB = 1024 KB

    // Realizamos la conversion
    double kilobytes = megabytes * conversion;

    // Mostrar el resultado por pantalla
      System.out.println (megabytes + " Megabytes equivalen a " + kilobytes +
			  " Kilobytes.");
  }
}
