package Basico;

public class ExercicioDeLaco2 {
    public static void main(String[] args) {
        int quantidadeNumerosImpares = 0;
        int numero=0;

        for (int i=1; i<=500; i++) {
            numero +=1;
            if ((numero %2)==1){
                System.out.println(i);
                quantidadeNumerosImpares +=1;

            }
        
        }
        
        System.out.println(numero);
        System.out.println(quantidadeNumerosImpares);

        int numeroWhile=1;
        while (numeroWhile <= 500){
            
        }
    
    }
    
}
