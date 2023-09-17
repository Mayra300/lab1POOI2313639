import java.util.Scanner;
public class E17
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    int cantidadNumeros = 0;
    int sumaImpares = 0;
    int mayorPares = 0;
    int Indicador = 0;

    while (Indicador == 0)
      {
    	System.out.print("Introduce un números (introduce un números negativo para salir): ");
    	int numero = sc.nextInt ();
    	if (numero < 0)
    	  {
    	    Indicador = 1;
    	  }
    
    	else
    	  {
    	    cantidadNumeros++;
    
    	    if (numero % 2 != 0)
    	      {
    		sumaImpares += numero;
    	      }
    	    else if (numero > mayorPares)
    	      {
    		mayorPares = numero;
    	      }
    	  }
     }
    
    
    if (cantidadNumeros > 0)
      {

	double mediaImpares = (double) sumaImpares / cantidadNumeros;

	System.out.println ("Cantidad de números introducidos: " + cantidadNumeros);
	System.out.println ("Media de los números impares: " + mediaImpares);
	System.out.println ("Mayor de los números pares: " + mayorPares);

      }
    else
      {

	System.out.println ("No se introdujo ningún número.");

      }
  }
}
