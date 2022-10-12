/* (Calculadora de comisiones de ventas)
200 por semana, mas el 9% de su venta*/

import java.util.Scanner;

public class Ejercicio4_19 
{
    public static void main(String[] args)
    {
        try (Scanner Etrda = new Scanner(System.in)) {
            String nom;
            int NArt, Sa=200, Rt ;
            double SaEt;

            System.out.println("Nombre del Empleado: ");
            nom=Etrda.next();

            do{
            System.out.println("Numero del Articulo Vendido: ");
            NArt=Etrda.nextInt();

            if(NArt==1)
            {
            SaEt = 239.99*0.09;
            System.out.printf("%s supago es: %.2f%n",nom,Sa+SaEt);
            }
            if(NArt==2)
            {
            SaEt = 129.75*0.09;
            System.out.printf("%s supago es: %.2f%n",nom,Sa+SaEt);
            }
            if(NArt==3)
            {
            SaEt = 99.95*0.09;
            System.out.printf("%s supago es: %.2f%n",nom,Sa+SaEt);
            }
            if(NArt==4)
            {
            SaEt = 350.89*0.09;
            System.out.printf("%s supago es: %.2f%n",nom,Sa+SaEt);
            }


            System.out.printf("Desea ingRtar otro articulo 1)SI o 2)NO\n");
            Rt=Etrda.nextInt();

            }
            while(Rt==1);
        }

    

    }
}