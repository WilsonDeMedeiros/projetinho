package Basico;
import java.util.Scanner;

public class NumeroParImpar{

public static void main(String[] args) {
    Scanner insiraONumero = new Scanner (System.in);
    
    System.out.println("Digite um numero");
    int numero = insiraONumero.nextInt();

    if (numero %2 ==1){
        System.out.println ("Numero Impar");
     } else {
        System.out.println("Numero Par");
    }
        
     insiraONumero.close();   
}
}