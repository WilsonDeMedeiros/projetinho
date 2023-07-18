package Basico;

public class ExercicioDeLaco {
    public static void main(String[] args) {
        //usando for
        
        int numero=0;

        for (int i=1; i<=500; i++) {
            if ((numero %2)==1){
                System.out.println(i);
            }
        }
        

        //usando while
        int numeroWhile=1;
        
        while (numeroWhile <= 500){
            if ((numeroWhile %2)==1){
                System.out.println(numeroWhile);
        }
        numeroWhile++;
    }
    

        //usando do while
        int numeroDoWhile=1;

        do {
            if ((numeroDoWhile%2)==1){
                System.out.println(numeroDoWhile);
            }
            numeroDoWhile++;
            
        } while (numeroDoWhile <=500);
    
    }
    
}
