
package com.mycompany.septiembre2022;
import java.util.Scanner;

public class Ejercicio_01 
{
    /*      @RigobertoSazo
      Un programa que lea un número y muestre su cuadrado, repetir el proceso 
      hasta que se introduzca un negativo*/
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        int num, cuadrado;
 
        System.out.print("Ingrese un numero para el cuadrado: ");
        num = in.nextInt();
        
        while(num>=0)
        {
            cuadrado =num*num;
            System.out.printf("El cuadrado de %d es: %d\n ", num, cuadrado);
            System.err.print("Introduce otro numero para el cuadrado: ");
            num = in.nextInt();
        }
        System.out.println("Fin ciclo, ud ingreso un numero negativo");
        
    }
    
}
