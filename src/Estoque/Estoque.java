package Estoque;

import Estoque.entity.Item;
import Estoque.service.EstoqueService;

public class Estoque {

    public static void main(String[] args) {
        
        EstoqueService estoqueService = new EstoqueService();

        estoqueService.addItem(001, "Caneta", 2.99f);
        estoqueService.addItem(002, "Lapis", 0.99f);
        estoqueService.addItem(003, "Caderno", 20.00f);
        estoqueService.showStock();

        estoqueService.removeItem(5);
        estoqueService.removeItem(001);
        estoqueService.showStock();
        
    }
    
}
