package Basico;

import java.util.Scanner;

public class RealDolar {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float iof = 0.038f;

        System.out.print ("Digite a cotação atual do dolar:");
        float cotacao = sc.nextFloat();
        System.out.print ("Digite o valor em reais:");
        float reais = sc.nextFloat();
        float valorConvertido = (reais / cotacao);
        System.out.printf("o valor em dolar é de %.2f\n", valorConvertido);

        float taxaiof = valorConvertido * iof;
        float totalcomprado = valorConvertido - taxaiof;

        System.out.printf("o valor comprado é de %.2f", totalcomprado);

        

        sc.close();

         


        
        

    }
}
