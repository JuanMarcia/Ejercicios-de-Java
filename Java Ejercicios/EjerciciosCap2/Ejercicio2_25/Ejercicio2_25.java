import java.util.Scanner;

public class Ejercicio2_25
{
    public static void main(String[]args)
    {
        int a;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("ingresa un numero: ");
            a = entrada.nextInt();
        }

        if (a%2==0)
            System.out.print("El numero es par");
        if (a%2==1)
            System.out.print("El numero es impar");
    }

}
