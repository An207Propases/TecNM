//loops

/**
 * Forexam
 */
// teorema de fibonacci

import java.util.Scanner;


public class Forexam {
  public static void main(String[] args) {
    int N,fibo=1,cont=0,anter=0;
     
    Scanner leer = new Scanner(System.in);

    System.out.println("DEFINA LIMITE");
    N=leer.nextInt();

      for (int i = 0; i <= N; i++) {
                 for (int j = 1; j <=N; j++) {
                  cont++;
                  alter+=cont;  
                    System.out.println("ejemplo"+(i+cont));
                 } 

     } 



  }
    
}

