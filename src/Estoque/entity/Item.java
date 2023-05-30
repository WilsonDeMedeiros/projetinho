package Estoque.entity;

public class Item {
    private int code;
    private String name;
    int quantity;
    float value;

    public Item (int code, String name, float value) {
        this.code = code;
        this.name = name;
        this.value = value;
        quantity = 0;
    }

    public float totalValue(){
        return value*quantity;
    }

    public int getCode(){
        return code;
    }

    public String getName(){
        return  name;
    }

    @Override
    public String toString(){
        return String.format("Codigo: %d  Nome: %s  Quantidade:  %d  Valor Unitario %.2f  Valor total em estoque: %.2f", code, name, quantity, value, totalValue());
    }
    
}
