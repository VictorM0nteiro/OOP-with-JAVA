package application;
import Entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        double tax = sc.nextDouble();

        employee.setName(name);
        employee.setGrossSalary(grossSalary);
        employee.setTax(tax);

        System.out.println("Employee: " + employee.getName() + ", " + "$ " + String.format("%.2f", employee.NetSalary()));

        System.out.println("Which porcentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Updated data: " + employee.getName() + ", " + "$ " + String.format("%.2f", employee.NetSalary()));


        sc.close();
    }
}
