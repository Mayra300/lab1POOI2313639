import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        
        long numeroAbsoluto = Math.abs(numero);
        long sumaDigitosPares = 0;

        String digitosPares = ""; // Almacenar los dígitos pares en una cadena
        
        while (numeroAbsoluto > 0) {
            long digito = numeroAbsoluto % 10;
            
            if (digito % 2 == 0) {
                digitosPares = digito + " " + digitosPares; // Agregar el dígito par al principio de la cadena
                sumaDigitosPares += digito;
               
            }
            
            numeroAbsoluto /= 10;
        }
        

            System.out.println("Dígitos pares: " + digitosPares); // Imprimir los dígitos pares en el orden correcto
            System.out.println("Suma de los dígitos pares: " + sumaDigitosPares);

    }
}

