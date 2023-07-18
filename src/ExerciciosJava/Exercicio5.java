package ExerciciosJava;
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) throws Exception {
        /*
         5 - Fazer algoritmo que leia número indeterminado de valores e determine o valor médio 
        do conjunto. O último valor, que não entrará no processamento, será igual a 0 (ZERO).
         */

         float valor=0;
         float quantidadeDeValores=0;
         float somaDosValores=0;

         Scanner leitor = new Scanner(System.in);

         do {
            System.out.println("Digite um numero");
            valor=leitor.nextFloat();
            if (valor==0){
                break;
            }else{
            quantidadeDeValores +=1;
            somaDosValores +=valor;
            }
         }

         while (valor !=0);

         leitor.close();

         float valorMedio= (somaDosValores/quantidadeDeValores);
         System.out.println(valorMedio);
    }
    
}
