public class jogode21 {
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    
        int resultadoTotal = 0;

        for (int i=1; resultadoTotal < 21; i++) {
            System.out.println("jogada número: " + i);
            int dado = (int)((Math.random () *6) +1); 
            System.out.println("resultado do dado: " + dado);
            resultadoTotal += dado;
            System.out.println("Soma dos Dados: " + resultadoTotal);
            System.out.println(" " );
            }

            if (resultadoTotal == 21) {
                System.out.println("21! Parabéns!");
            } else {
                System.out.println("Estourou! Insira uma ficha e tente mais uma vez");
                }
        }
    
          


}



