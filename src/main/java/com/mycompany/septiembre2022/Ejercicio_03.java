
package com.mycompany.septiembre2022;
import java.util.Scanner;

/*      @RigobertoSazo
    Un programa que lea numeros hasta que se introduzca un 0, 
    para cada uno indicar si es par o impar
*/

public class Ejercicio_03 {
    public static void main(String[] args) {
         
        Scanner in = new Scanner (System.in);
        int num;
 
        System.out.print("Ingrese un numero Entero: ");
        num = in.nextInt();   
        while(num!=0)
        {
            if(num%2==0)
            {
                System.out.printf("El numero %d es Par", num);
                System.out.print("\nIntroduce otro numero: ");
                num = in.nextInt();
            }else{
                System.out.printf("El numero %d es Impar", num);
                System.out.print("\nIntroduce otro numero: ");
                num = in.nextInt();
            }
        }
        System.err.println("Fin del ciclo, ud ingreso un numero 0 ");
    }
}
