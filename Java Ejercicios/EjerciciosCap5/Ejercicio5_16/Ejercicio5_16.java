package Ejercicio5_16;

import java.util.Scanner; 
  
  public class Ejercicio5_16
  {        

    public static void main(String[] args)
    {

  System.out.print("\nIntroduzca cinco enteros entre 1 y 30");
  System.out.println(" y se imprimira un histograma horizontal.\n");  

  try (Scanner entrada = new Scanner(System.in)) {
    int numero;
    int contador = 1;

    while ( contador <= 5 )
    {         
    System.out.printf("\nPor favor introduzca el numero %d:\n ", contador);
    numero = entrada.nextInt();

    if ((1 <= numero) && ( 30 >= numero))
    {     

    for ( int i = 1; i <= numero; i++ )
    System.out.print("*");

    System.out.println();

    contador++;
    }       
    }         
  }
  

  }      

         
  }        