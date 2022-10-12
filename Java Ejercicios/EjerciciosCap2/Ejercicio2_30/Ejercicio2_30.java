package Ejercicio2_30;

import java.util.Scanner;

public class Ejercicio2_30
{
    public static void main(String[]args)
    {
        int a;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingresa un numero de 5 cifras: ");
            a = entrada.nextInt();
        }

        if (a>9999)
            if (a<100000)


            System.out.printf("%d   %d   %d   %d   %d",

             a/10000,

            (a%10000)/1000,

            (a%10000%1000)/100,

            (a%10000%1000%100)/10,

            (a%10000%1000%100%10));

        if (a>99999)
            System.out.print("Este numero tiene mas de 5 cifra!!!");
        if (a<10000)
            System.out.print("Este numero tiene menos de 5 cifras!!");
    }
}