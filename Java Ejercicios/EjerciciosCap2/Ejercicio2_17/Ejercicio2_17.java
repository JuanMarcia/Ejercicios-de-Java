import java.util.Scanner;

public class Ejercicio2_17
{
    public static void main(String[]args)
    {
        int a,b,c;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingresa el primer numero: ");
                a = entrada.nextInt();
            System.out.print("Ingresa el segundo numero: ");
                b = entrada.nextInt();
            System.out.print("Ingresa el tercer numero: ");
                c = entrada.nextInt();
        }

        System.out.println("El suma es " + (a+b+c));
        System.out.println("El promedio es " + ((a+b+c)/3));
        System.out.println("El producto es " + (a*b*c));


        if (a<b)
            if (a<c)
                System.out.println("El numero menor es: " + a);
        if (b<a)
            if (b<c)
                System.out.println("El numero menor es: " + b);
        if (c<a)
            if (c<b)
                System.out.println("El numero menor es: " + c);        
        if (a>b)
            if (a>c)
                System.out.println("El numero mayor es: " + a);          
        if (b>a)
            if(b>c)
                System.out.println("El numero mayor es: " + b);
        if (c>a)
            if(c>b)
                System.out.println("El numero mayor es: " + c);   
    }
}