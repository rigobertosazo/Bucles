
package com.mycompany.septiembre2022;
import java.util.Scanner;
/**
 *              @RigobertoSazo
 *  Un programa que pida numeros hasta que se teclee un 0, mostrar la suma de todos
 *  los numeros introducidos
 */
public class Ejercicio_05 {
    public static void main(String[] args) 
    {    
        Scanner in = new Scanner(System.in);
        int num;
        int suma=0;
        do { 
            System.out.print(" Ingrese un numero: ");
             num = in.nextInt();
             suma += num;
        } while (num!=0);
        System.out.printf("La suma es de los numeros ingresados es: %d ",suma);
    }  
}
