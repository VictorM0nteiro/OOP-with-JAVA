package Entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;
    private double newSalary;

    public double NetSalary(){
        newSalary = grossSalary - tax;
        return grossSalary - tax;
    }

    public void IncreaseSalary(double porcentage){
         newSalary = newSalary + newSalary * porcentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getTax() {
        return tax;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
}
