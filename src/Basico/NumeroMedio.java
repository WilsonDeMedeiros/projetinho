package Basico;
import java.util.Scanner;

public class NumeroMedio {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner digiteUmNumero = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int numero1= digiteUmNumero.nextInt();

         System.out.println("digite o segundo numero: ");
        int numero2= digiteUmNumero.nextInt();
        
         System.out.println("digite o terceiro numero: ");
        int numero3= digiteUmNumero.nextInt();

        int xNumeroMedio = ((numero1 + numero2 + numero3)/3);
        System.out.println("A media dos numeros e:" + xNumeroMedio);

        digiteUmNumero.close();

    }
}
