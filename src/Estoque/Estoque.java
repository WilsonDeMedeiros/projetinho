package Estoque;

import java.util.Scanner;
import Estoque.service.EstoqueService;

public class Estoque {

    public static void main(String[] args) {
        
        EstoqueService estoqueService = new EstoqueService();

        Scanner scan = new Scanner(System.in);

        while (true){

        System.out.println("----------Opcoes Disponiveis----------");
        System.out.println("1 - Consultar Estoque");
        System.out.println("2 - Busca Pesonalizada");
        System.out.println("3 - Cadastrar Item");
        System.out.println("4 - Deletar Item");
        System.out.println("5 - Adicionar Quantidade ao Item");
        System.out.println("6 - Remover Quantidade do Item");
        System.out.println("0 - SAIR");

        int option = scan.nextInt();

        if (option == 1) {
            estoqueService.showStock();

            }else if (option == 2){
               System.out.println("Digite o Codigo ou nome do Produto: ");
               String search = scan.nextLine();
               search = scan.nextLine();
               estoqueService.specialSearch(search);
            
            }else if(option ==3){
                System.out.println("Digite o Codigo do Item: ");
                int code = scan.nextInt();
                System.out.println("Digite o Nome do Item: ");
                String name = scan.nextLine();
                name = scan.nextLine();
                System.out.println("Digite o Valor do Item: ");
                float value = Float.parseFloat(scan.next().replace(',', '.'));
                estoqueService.addItem(code, name, value);

            }else if (option ==4){
                System.out.println("Digite o Codigo do Item: ");
                int code = scan.nextInt();
                estoqueService.removeItem(code);

            }else if (option ==5){    
               System.out.println("Digite o Codigo do Item: ");
               int code = scan.nextInt();
               System.out.println("Digite a quantidade a ser adicionada : ");
               int ammount = scan.nextInt();
               estoqueService.addAmmount(code, ammount);
               System.out.printf("\n%d unidades adicionadas do seguinte item: %s\n", ammount, estoqueService.itemName(code));

            }else if (option ==6){    
                System.out.println("Digite o Codigo do Item: ");
                int code = scan.nextInt();
                System.out.println("Digite a quantidade a ser removida : ");
                int ammount = scan.nextInt();
                estoqueService.removeAmmount(code, ammount);
                System.out.printf("\n%d unidades removidas do seguinte item: %s\n", ammount, estoqueService.itemName(code)); 
                System.out.println("");          
            
        } else {
            System.out.println("SISTEMA FINALIZADO");
            break;
        }

        
       
    }

    scan.close();
        
    }
    
}
