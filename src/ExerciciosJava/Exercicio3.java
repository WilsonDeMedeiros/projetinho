package ExerciciosJava;
import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args) throws Exception{
        /*
          3 – Fazer algoritmo que leia número indeterminado de valores e diga qual deles é o maior, 
        considerando que todos sejam diferentes entre si. O último valor, que não entrará no 
        processamento, será igual a 0 (ZERO).
         */

        float valor=0;
        float maiorValor=0;
        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Digite um numero:");
            valor = leitor.nextFloat();
            if (valor > maiorValor){
                maiorValor = valor;
            }
        }

        while (valor !=0);

        leitor.close();

        System.out.println("o maior numero é: " + maiorValor);

    }
    
}
