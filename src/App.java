import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner numeroDeVezes = new Scanner(System.in);

        System.out.print("Quantidade de Vezes: ");
        int vezes = (numeroDeVezes.nextInt()+1);

        for(int i = 1; i < vezes; i++) {
            int valor = (int)((Math.random() *6)+1);
            System.out.print("Jogada " + i);
            System.out.println(" Valor: " + valor);
        }

        

        numeroDeVezes.close();

         


        
        

    }
}
