package ExerciciosJava;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
         6 – Fazer algoritmo que leia número indeterminado de salários dos funcionários de uma 
        fábrica de automóveis e determine o salário médio do grupo. O último valor de salário, 
        que não entrará nos cálculos, deverá ser 0 (ZERO). A seguir, determine e informe quantos 
        funcionários ganham até o valor da média salarial e quantos ganham acima da média.
         */

         float salario=0;
         int numeroDeFuncionarios=0;
         float somaDosSalarios=0;
         float[] todosOsSalarios = new float[9999];
         Scanner leitor = new Scanner(System.in);

         for (int i=0;i<9999;i++){
            System.out.println("Digite o salario: ");
            salario=leitor.nextFloat();
            if (salario==0){
                break;
            }else{
                todosOsSalarios[i]=salario;
                somaDosSalarios +=salario;
                numeroDeFuncionarios++;
            }
         }

         leitor.close();

         float mediaSalarial = (somaDosSalarios/numeroDeFuncionarios);
         int salariosNaMedia=0;
         int salariosAcimaDaMedia=0;

         for (float salarioIndividual : todosOsSalarios) {
            if (salarioIndividual <= mediaSalarial && salarioIndividual>0){
                salariosNaMedia +=1;
            }else if (salarioIndividual >mediaSalarial){
                salariosAcimaDaMedia +=1;
            }
         }

         System.out.println("media salarial: " + mediaSalarial);
         System.out.println("Salarios na media: " + salariosNaMedia);
         System.out.println("Salarios acima da media: " + salariosAcimaDaMedia);
        
    }
    
}
