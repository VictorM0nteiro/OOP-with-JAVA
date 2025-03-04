package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){//ainda poderei utilizar o construtor padrão
    }

    //Construtor depois dos atributos e antes dos métodos
    public Product(String name, double price, int quantity) {
        this.name = name; //diferenciar atributos de variáveis locais
        this.price = price;
        this.quantity = quantity;
    }
    //copnstrutor não tem tipo

    //sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



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
