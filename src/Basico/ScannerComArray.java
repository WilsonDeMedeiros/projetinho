package Basico;
import java.util.Scanner;

public class ScannerComArray {

public static void main (String[] args) throws Exception {
     Scanner resposta = new Scanner (System.in);
     int tam = 5;
     int nota = 0;

     char respostas[] = new char [tam];
     char gabarito [] = {'a', 'b', 'c', 'd', 'd'};

     for (int i=0; i<tam; i++) {
      System.out.print ("Digite a resposta da questão número " + (i+1) + " ");
      respostas [i] = resposta.nextLine().charAt(0);
      if (respostas[i] == gabarito[i]) {
        nota +=20;
      }
     }

     resposta.close();

     System.out.println ("sua nota é " + nota);



      

    
      
    }
}

