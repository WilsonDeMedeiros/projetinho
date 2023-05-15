import java.util.Scanner;

public class ScannerTeste {

public static void main (String[] args) throws Exception {
      Scanner infoDigitada = new Scanner (System.in);
      String nome = " ", aprovado = ""; 
      int n1=0, n2=0, n3=0;
      final int MEDIA = 60;
      

      System.out.println ("Digite o nome do aluno");
      nome = infoDigitada.nextLine();
      System.out.println("Digite a nota n1");
      n1 = infoDigitada.nextInt();
      System.out.println("Digite a nota n2");
      n2 = infoDigitada.nextInt();
      System.out.println("Digite a nota n3");
      n3 = infoDigitada.nextInt();
      int notaFinal = n1 + n2 + (n3*2);

      if (notaFinal >= MEDIA) {
        aprovado = "foi aprovado";
      }else if (notaFinal >=40) {
            aprovado = "está de recuperação";
        }else {
            aprovado = "foi reprovado";
        }
        
        System.out.printf ("O aluno %s %s com média %d", nome, aprovado, notaFinal);

        infoDigitada.close();
      }



      

    
      

}

