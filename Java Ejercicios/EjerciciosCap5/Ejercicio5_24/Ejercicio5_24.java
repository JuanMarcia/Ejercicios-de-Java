import java.util.Scanner;

public class Ejercicio5_24
{
    public static void main(String[] args)
    {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("N: ");
            int b = entrada.nextInt();

            for(int d=0; d<=b; d++){
                for(int c=b-d; c>0; c--){
                    System.out.print(" ");
                }
                for(int c=0; c<d; c++){
                    System.out.print(" *");
                }
                System.out.println("");
            }
            for(int d=0; d<=b; d++){
                for(int c=0; c<=d; c++){
                    System.out.print(" ");
                }
                for(int c=b-d-1; c>0; c--){
                    System.out.print(" *");
                }
                System.out.println("");
            }
        }
    }   
}