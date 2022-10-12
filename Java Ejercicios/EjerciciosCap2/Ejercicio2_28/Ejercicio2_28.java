package Ejercicio2_28;

import java.util.Scanner;
public class Ejercicio2_28
{
    public static void main(String[]args)
    {
        int a;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("ingrese el radio de un circulo: ");
            a = entrada.nextInt();
        }

        System.out.println("Diametro " + (2*a));
        System.out.printf("%s %f %n", "Circunferencia", (2*Math.PI*a));
        System.out.print("Area " + (a*a));
    }
}
