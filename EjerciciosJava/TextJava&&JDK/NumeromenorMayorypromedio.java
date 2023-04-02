import java.util.Scanner;

public class NumeromenorMayorypromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de N: ");
        int N = sc.nextInt();
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int acumulador = 0;
        int contador = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            if (numero == 0) {
                continue;
            }
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            acumulador += numero;
            contador++;
        }
        System.out.println("El número más grande ingresado es: " + mayor);
        System.out.println("El número más pequeño ingresado es: " + menor);
        double promedio = contador == 0 ? 0 : (double) acumulador / contador;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}






