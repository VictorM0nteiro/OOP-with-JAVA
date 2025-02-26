package Application;

import Util.Calculator;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Não é mais necessário instanciar
        //Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        //double c = calc.circunference não é necessário instanciar com o static
        double c = Calculator.circunference(radius); //Se usa diretamente a classe

        double v = Calculator.volume(radius);

        System.out.println("Diameter is: " + radius*2);
        System.out.printf("Circunference is: %.2f%n", c);
        System.out.printf("Volume is: %.2f%n", v);
        System.out.printf("PI value is: %.2f%n", Calculator.PI);


        sc.close();
    }

}
