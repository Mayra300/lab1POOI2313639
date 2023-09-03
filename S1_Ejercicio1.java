/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



import java.util.Scanner;

public class S1_Ejercicio1 {

    public static void main(String[] args) {

    //===========ejercicio 1a ===========  
     
        if (6 < 6 * 5) 
            System.out.print("Hello");       
            System.out.print(" There");
            // respuesta: Hello There
            
    //===========ejercicio 1b ===========  

        int x = 1, y = 2, z = 3;
        
        if (x > y) 
        if (x > z) 
            System.out.println("1111");
        else 
            System.out.println("2222");       
        // respuesta: 
    //===========ejercicio 1c ===========    
      
        int x = 1, y = 2, z = 3;
    
        if (x < z)
            System.out.println("*");
        else if (x == z) 
            System.out.println("&");
        else
            System.out.println("$");
          // respuesta:*
    //===========ejercicio 1d ===========   
    
        int x = 1, y = 2, z = 3;
        if (x < y) 
            System.out.println("####");
        else 
            System.out.println("&&&&");
            System.out.println("****");
         // respuesta:####
         //****  
    //===========ejercicio 1e ===========    
    
        int x = 1, y = 2, z = 3;
        if (x > y) {
            System.out.println("####");
        } else {
            System.out.println("&&&&");

            System.out.println("****");
        }// respuesta:&&&&
        // ****
    //===========ejercicio 1f ===========     
       
        int al=100; int a2=200;
        if(al>100 && a2<=200)
        System.out.print(al+" "+a2+" "+(al+a2)); 
        else
        System.out.print(al+" "+a2+" "+(2*al-a2));   
        // respuesta:100 200 0
        
        //===========ejercicio 1g ===========    
    
        int X = 1, Y = 2, Z = 3;
        if(++X > Y++ || X-- > 0)
            Z++;
        else
            Z--;
        System.out.println(X+" "+Y+" "+Z);
        // respuesta:1 3 4
        //===========ejercicio 1h ===========     
        int x=1, y=2, z=3;
        if(x<y){
        System.out.println("####");
        System.out.println("****");
        }
        else
        System.out.println("&&&&");
        // respuesta:####
        // ****
         //===========ejercicio 1i ===========     
        int x=1, y=2, z=3;
        if ('x' > 'y' || 66> (int)('A')).
        System.out.println("#*#");
        // respuesta:#*#
        
        //===========ejercicio 1j ===========     
        int x = 1, y = 2, z = 3;
    
        if (x < z)
            System.out.println("*");
        else if (x == z) 
            System.out.println("&");
        else
            System.out.println("$");
          // respuesta:*
    }
}
