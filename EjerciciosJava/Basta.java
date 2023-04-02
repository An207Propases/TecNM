// jdk basta java 
// Player's-Name  Order: Name Animal Objet Color  City Country Plants\Body  frut points 
//local es en Clase            crear ID online para las Salas  Cronometro inverso
//import javax.swing.JOptionPane;
//import java.util.Calendar;
//import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.util.Random;
import java.util.Scanner;




public class Basta 
{ 
 public static void main(String[] args) 
 { 

  Scanner sco = new Scanner(System.in);
    
    //Points
    int minid = 1020;
    int maxid = 9999;
    int count = 0;
     
    int RoundNumber,PointRound, ValueT, ValueTot;

    Random random = new Random();
    int ID = (int)Math.floor(Math.random() *(maxid-minid+1)+minid);
    String letraRand = "abcdefghijkLmnñopqrstuvxyz";
    int randomInt = random.nextInt(letraRand.length());
    char randomChar =letraRand.charAt(randomInt);
    /*/ actualizar mas adelante System.out.println("Jugar Modo 1 Local 2 Online"); /*/
   // String ModSelect= sco.nextInt(); 
    System.out.println("Nombre del Equipo / Jugador");
    String IDPlayers= sco.nextLine();
    System.out.println("Fecha: / /");
    String CalendarIo= sco.nextLine();
    System.out.println("--------------");
    System.out.println("Preciona #: Letra al Azar(1) o Letra Seleccionada(2)"); 
    
    int Input= sco.nextInt();
    sco.nextLine();

    //modo local\select letter  && onlinemachine\random 
    switch (Input) {
        case 1:
          
        while(Input==1){
          System.out.println("Toco la letra: "+randomChar);
          System.out.println(" Nombre: "); 
          String Name1;
          Name1 = sco.nextLine();
          System.out.println("Animal: ");
           String Animal1 = sco.nextLine();
          System.out.println("Objeto: ");
           String Object1 = sco.nextLine();
          System.out.println("Color: ");
           String Color1 = sco.nextLine();
          System.out.println("Ciudad o Pais: ");
           String CityP1 = sco.nextLine();
          System.out.println("Plantas: ");
           String PlantsBody1 = sco.nextLine();
          System.out.println("Fruta: ");
           String fruit1 = sco.nextLine();
          //end 1
          System.out.println(ID+" Nombre Usuario: "+IDPlayers+" Letra: "+randomChar);
          System.out.println("Resultados | Valor:");
          System.out.println("Nom "+Name1);
          int Value1 = sco.nextInt();
          System.out.println("Ani "+Animal1);
          int Value2 = sco.nextInt();
          System.out.println("Obj "+Object1);
          int Value3 = sco.nextInt();
          System.out.println("Col "+Color1);
          int Value4 = sco.nextInt();
          System.out.println("CiuoPai "+CityP1);
          int Value5 = sco.nextInt();
          System.out.println("Pla "+PlantsBody1);
          int Value6 = sco.nextInt();
          System.out.println("Fru "+fruit1);
          int Value7 = sco.nextInt();
          ValueT=Value1+Value2+Value3+Value4+Value5+Value6+Value7;
          
          if (ValueT<=70) {
            System.out.println("Fecha: "+CalendarIo+" Puntos: "+ValueT);  
              } else{
             System.out.println("No puedes tener mas de 71 puntos por ronda: ");
             }
            break;
        }

         for(int RoundNumber2=Input;RoundNumber2==1;RoundNumber2++){
            System.out.println( " Fecha: "+CalendarIo+" Fin de la Ronda "+RoundNumber2+" clPuntos: ");


            } 

        case 2:
      
     while(Input==2){
        System.out.print("Selecciona la letra del a-z:");
        String letra= sco.nextLine();
        System.out.println("Nombre: ");
        String Name = sco.nextLine();
        System.out.println("Animal: ");
         String Animal =sco.nextLine();
        System.out.println("Objeto: ");
         String Object = sco.nextLine();
        System.out.println("Color: ");
         String Color = sco.nextLine();
        System.out.println("Ciudad o Pais: ");
         String CityP = sco.nextLine();
        System.out.println("Plantas: ");
         String PlantsBody = sco.nextLine();
        System.out.println("Fruta: ");
         String fruit = sco.nextLine();
        //end 2
        System.out.println(ID+" Nombre Usuario: "+IDPlayers+" Letra "+letra);
        System.out.println("Resultados Da el/ Valor 0-10 0 muchos 5 dos 10 ninguno:");
        System.out.println("Nom "+Name);
        int Value12 = sco.nextInt();
        System.out.println("Ani "+Animal);
        int Value23 = sco.nextInt();
        System.out.println("Obj "+Object);
        int Value34 = sco.nextInt();
        System.out.println("Col "+Color);
        int Value45 = sco.nextInt();
        System.out.println("CiuoPai "+CityP);
        int Value56 = sco.nextInt();
        System.out.println("Pla "+PlantsBody);
        int Value67 = sco.nextInt();
        System.out.println("Fru "+fruit);
        int Value78 = sco.nextInt();
        ValueTot=Value12+Value23+Value34+Value45+Value56+Value67+Value78;
          if (ValueTot<=70) {
            for(RoundNumber=-1;RoundNumber<Input;RoundNumber++){
                count ++;
               } 
                System.out.println( " Fecha: "+CalendarIo+" Fin de la Ronda "+count+" clPuntos: "+ValueTot);
                //contador rondas
                  if(ValueTot>=2){
                    for(int Rop=1; Rop <Input; Rop++){
                    PointRound=Rop+ValueTot;
                      }
                  }else{
                    PointRound = ValueTot;
                  }


            System.out.println("Opciones: Volver a jugar(1)  NuevaRonda(2)  Puntos de las Rondas (3)  Salir(4)"); 
             int Represent =sco.nextInt();
              sco.nextLine();
              if(Represent==3){
                 for(int x=0;x<RoundNumber;x++){
                 System.out.println(" Fin de la Ronda "+x+"Puntos: "+ValueTot);
                 }
              }
           //Switch PlayAgain, newgame or out 
           
           switch (Represent) {
            case 1: 
            //public String retorno(String nombre){
             // String saludo = "Repdetido"+nombre;
            //  return saludo;
           // }
             // String saludo = objeto.saludo("Ale");
             // System.out.println(saludo);
                break;
            case 2:
                //end repeat while init
            break;
           case 3:
            
             // System.out.println("Puntos Totales: "+PointRound);
             break;
           case 4:
           
           System.out.println("Closing Programm");
            System.exit(Represent);
              
             break;
            default:
            System.out.print("No existe otra opcion");
                break;
             }

             } else{
            System.out.println("No puedes tener mas de 72 puntos por ronda: ");
            }  
        }
        
       
           break;    
        default:
        System.out.print("valor numerico no dado o error al teclear");
        System.out.println(" Tu ID es "+ ID +" con Nombre "+IDPlayers+" Fecha del Error: "+CalendarIo+" Reportar Fallos al correo: jalopro9@gmail.com");
            break;
    }

    }
   
}