package Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //o this serve para referenciar o atributo da classe
        // ai o outro quantity é o parametro recebido
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price) //para definir duas casas decimais em Java
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
