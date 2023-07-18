package ExerciciosJava;
import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) throws Exception {
        /*
         4 – Fazer algoritmo que leia número indeterminado de valores e diga se eles são pares ou 
        ímpares. O último valor, que não entrará no processamento, será igual a 0 (ZERO).
         */

        float valor=0;
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println("Digite um numero: ");
            valor = leitor.nextFloat();
        if (valor==0){
            break;
        } else if (valor%2==0){
                System.out.println("numero par!");
            } else {
                System.out.println("Numero impar!");
            }
        }

        while (valor !=0);
        leitor.close();
        System.out.println("Fim!");
    }
    
}
