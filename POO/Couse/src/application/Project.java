package application;
import Entities.Product;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

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
