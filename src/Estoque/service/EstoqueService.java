package Estoque.service;

import java.util.ArrayList;
import java.util.List;

import Estoque.entity.Item;

public class EstoqueService {

    private List<Item> stock = new ArrayList<>();

    //mostrar todos os itens em estoque

    public void showStock(){
        System.out.println("Lista de Itens: ");
        for (Item item: stock) {
            System.out.println(item);
        }
    }
    
    // adicionar novo item 

    public void addItem (int code, String name, float value){
        if (existsByCode(code)){
            System.out.printf("Código %d já cadastrado!%n", code);
        } else if (existsByName(name)){
            System.out.printf("Nome %s já cadastrado!%n", name);
        } else {
        Item item = new Item(code, name, value);
        stock.add(item);
    }
    }

    private boolean existsByCode (int code){
        for (Item item : stock) {
            if (item.getCode() == code) {
                return true;
            }
            
        } 
        return false;
    }

    private boolean existsByName (String name){
        for (Item item : stock) {
            if (item.getName().equals(name)) {
                return true;
            }
            
        } 
        return false;
    }

    //remover item

    public void removeItem (int code){
        Item item = getByCode (code);
        if (item == null) {
            System.out.println("Item não encontrado!");
        } else {
            stock.remove(item);
        }

    }

    private Item getByCode (int code){
        for (Item item : stock) {
            if (item.getCode() == code){
                return item;
            }
        }
        return null;
    }

    
}
