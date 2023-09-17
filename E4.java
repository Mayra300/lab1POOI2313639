public class E4
{
  public static void main (String[]args)
  {
    // Definimos la cantidad en soles
    double soles = 100.0;	

    // Definimos la tasa de conversion 
    double tasa = 0.11;	// 1 sol =  0.11 euros

    // Realizamos la conversion
    double euros = soles * tasa;


    // Mostramos el resultado por pantalla
      System.out.println (soles + " soles equivalen a " + euros + " euros.");

  }
}
