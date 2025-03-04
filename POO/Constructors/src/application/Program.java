package application;
import entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Product product = new Product(); só depois instanciar
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("price: ");
        double price = sc.nextDouble();
        //Product product = new Product(); quando fizer um construtor vazio ainda é possivel utilizar a instanciação padrão
        Product product = new Product(name, price);//construtor

        //System.out.print("Quantity: ");
        //int quantity = sc.nextInt();
        product.setName("computer");
        System.out.println("Updated product name: "+ product.getName());

        System.out.print("Update the price:");
        double updatePrice = sc.nextDouble();
        product.setPrice(updatePrice);
        System.out.println("Updated price: "+ product.getPrice());

        System.out.print("Update the quantity: ");
        int updateQuantity = sc.nextInt();
        product.setQuantity(updateQuantity);
        System.out.println("Updated quantity: "+ product.getQuantity());


        System.out.println("\nProduct data: " + product); //implicitamente chama o toString


        System.out.print("\nEnter the number of products to be added in stock: ");
        int prodQuantityAdded;
        prodQuantityAdded = sc.nextInt();
        product.addProducts(prodQuantityAdded);
        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed from stock:");
        int prodQuantityRemoved;
        prodQuantityRemoved = sc.nextInt();
        product.removeProducts(prodQuantityRemoved);
        System.out.println("\nUpdated data: " + product);


        sc.close();
    }
}

