package Application;

import entities.Triangle;  //importando do pacote entities o Triangle

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //Quando você
        // define o Locale padrão como Locale.US,
        // você está configurando a aplicação para usar as
        // convenções dos Estados Unidos
        Scanner sc = new Scanner(System.in);

        Triangle x, y; //declarando x e y do tipo triangle
        x = new Triangle(); //instanciando os objetos com o NEW
        y = new Triangle(); // x e y sao os objetos, sao instancias da classe

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble(); //guardar no atributo A do triangulo
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble(); //guardar no atributo A do triangulo
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println(x.a + "," + x.b + "," + x.c);
        System.out.println(y.a + "," + y.b + "," + y.c);

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX); //printf is used
        // when printing floats doubles etc
        System.out.printf("Trinagle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("The area of the X triangle is greater");
        }else if (areaX < areaY)System.out.println("The area of the Y triangle is greater");
        else System.out.println("They are equal");


        sc.close();
    }
}
