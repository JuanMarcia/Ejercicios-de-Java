package Ejercicio5_13;

public class Ejercicio5_13

  {      
    public static void main(String[] args)
    {          
  for ( int i = 1; i <= 20; i++ )
  {   
  
  int factor = 1;
  int numero = i;

 
  while ( 0 < numero )
  {       
  factor *= numero--;
  }        

  System.out.printf("\nEl factorial de %d es: %d\n", i, factor );


  }   // Cierra for
  }             // Cierra metodo factorial


  }      // Cierra clase publica Deitel_