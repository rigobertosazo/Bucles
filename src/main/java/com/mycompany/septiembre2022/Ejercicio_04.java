
package com.mycompany.septiembre2022;
import java.util.Scanner;

/*              @RigobertoSazo
    Realizar un juego para adivinar un numero, para ello pedir un número "N", y luego ir pidiendo
    numeros indicando mayor o menor segun sea mayor o menor con respecto a N. El proceso termina
    cuando el usuario acierta
*/

public class Ejercicio_04 {
 public static void main(String[] args) {
 
    Scanner in = new Scanner(System.in);
    int num = 0;
    int aleatorio = (int)(Math.random()*100); //numeros aleatorios de 1 al 100
    System.out.println("****** QUE COMIENCE EL JUEGO ****");
    System.out.println("----- Adivina el  numero entre (1-100) ------");
    System.out.print(" Ingrese un numero: ");
    num = in.nextInt();
        while (num != aleatorio) 
        {
            if (num < aleatorio) {
                System.out.println("El numero es mayor!!");
                System.out.print(" Ingrese un numero: ");
                num = in.nextInt();
            } else if (num > aleatorio) {
                System.out.println("El numero es menor!!");
                System.out.print(" Ingrese un numero: ");
                num = in.nextInt();
            }
            if (num == aleatorio) {
                System.out.println("Acertaste, te ganaste una tu michelada !!!");
                break;
            }
        }
    }
}
    
    

