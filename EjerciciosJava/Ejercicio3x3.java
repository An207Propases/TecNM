public class Ejercicio3x3 {
    public static void main(String[] args) {
        int matriz[][]=new int[3][3];
         
        //i = filas y j = columnas
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                matriz[i][j]=(i*matriz.length)+(j+1);
                System.out.print(matriz[i][j]+"|");
                 
            }
            System.out.println("");
        }
    }
}

//Ejercicio matriz represantar 3x3 numeros del 1 al 9