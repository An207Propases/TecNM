import java.util.Scanner;
public class pockemonparimparcero {
    public static void main(String[] args) {
        int var1,x,contpar=0,contimp=0,contcero=1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar valor entero: ");

        var1=sc.nextInt();        
      
      
      do{
        //dividirlo de 10 en 10
        if(var1>=10){
        var1=var1/10;
        }
         x = var1%10;
        
        //residu
        //condicional si x residuo es igual a 0
        if(x%2==0)
        {
        contpar=contpar+1;
        }        
        else if(x%2!=0){
        contimp=contimp+1; 
        }
        else if(x==0 || var1==0){
          contcero=contcero+1;
        }
        else{
          System.out.println("ningun numero");
        }

      }while(var1!=0);
      
      System.out.println(" valores par >"+ contpar +" / valor impar >"+contimp+" /valores de cero >"+contcero);
    }
}
