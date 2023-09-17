public class E3
{
  public static void main (String[]args)
  {
    // Definimos la cantidad en euros
    double euros = 10;	// Cambia este valor al que desees convertir

    // Definimos la tasa de conversion
    double tasa = 166.386;	// 1 euro = 166.386 pesetas 

    // Realizamos la conversion
    double pesetas = euros * tasa;

    // Mostrar el resultado por pantalla
      System.out.println (euros + " euros equivalen a " + pesetas +
			  " pesetas.");
  }
}
