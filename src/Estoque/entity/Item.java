package Estoque.entity;

public class Item {
    private int code;
    private String name;
    private int quantity;
    float value;

    public Item (int code, String name, float value) {
        this.code = code;
        this.name = name;
        this.value = value;
        quantity = 0;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity (int ammount){
        quantity += ammount;
    }

    public void removeQuantity (int ammount){
        if (ammount > quantity){
            System.out.println("Quantidade inválida. Disponível em estoque: " + quantity);
        } else {
            quantity -= ammount;
        }
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
