import java.util.Scanner;

public class Ejercicio4_30
{

public static void main(String[] args) 
{
    int num,cifra1, cifra2, cifra3, cifra4, cifra5;

    try (Scanner entrada = new Scanner(System.in)) {
        System.out.println("Introduzca un numero");
        num = entrada.nextInt();
        //Las lineas de abajo realizan la validacion para que numero tenga 5 cifras 
        while (!(num>=10000&&num<=99999))
        {
            System.out.println("El numero debe ser de 5 digitos, vuelva y digite");
            num = entrada.nextInt();
            }
    }
    // Descompone el numero cifra a cifra
    cifra1= num/10000;
        cifra2= (num%10000)/1000;
        cifra4= (num%100)/10;
        cifra5= (num%10);
    //Revisa que se cumpla la condicion para que sea palindromo    
            if(cifra1==cifra5 && cifra2==cifra4){ 
                System.out.println("El numero es palindromo");      
            }else
                System.out.println("El numero No es palindromo");  
        }
    
    } 