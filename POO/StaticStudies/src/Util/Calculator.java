package Util;

public class Calculator {
    public static final double PI = 3.14159; //palavra final serve justamente para falar que um valor é constante e imutável
    //Padrão de nomes para constantes é sempre letras maiúsculas

    public static double circunference(double radius){
        return 2*PI*radius;
    }

    public static double volume(double radius){
        return (4*PI*radius*radius*radius) / 3.0;
    }
}
