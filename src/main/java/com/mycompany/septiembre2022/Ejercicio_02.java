
package com.mycompany.septiembre2022;
import java.util.Scanner;

public class Ejercicio_02 {
    
    /*      @RigobertoSazo
        un programa que lea un numero e indicar si es positivo o negavito
        repetir el proceso hasta que introduczca un numero negativo*/
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int num;
 
        System.out.print("Ingrese un numero Entero: ");
        num = in.nextInt();   
        while(num!=0)
        {
            if(num>0)
            {
                System.out.printf("El numero %d es Positivo", num);
                System.out.print("\nIntroduce otro numero: ");
                num = in.nextInt();
            }else{
                System.out.printf("El numero %d es Negativo", num);
                System.out.print("\nIntroduce otro numero: ");
                num = in.nextInt();
            }
        }
        System.err.println("Fin del ciclo, ud ingreso un numero 0 ");
    }
    
}
