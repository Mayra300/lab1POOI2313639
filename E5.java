public class E5
{
  public static void main (String[]args)
  {
    // Definimos  las horas trabajadas por el empleado
    int horas = 40;

    // Definimos  la tarifa por hora
    double tarifa = 12.0;

    // Calculamos el salario semanal
    double salario = horas * tarifa;

    // Mostramos el salario por pantalla
      System.out.println ("El salario semanal del empleado es: " +
			  salario + " euros");
  }
}
