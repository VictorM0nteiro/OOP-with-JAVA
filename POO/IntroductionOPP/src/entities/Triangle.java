package entities; //pacote da classe

public class Triangle { //nome da classe
    public double a; //atributos da classe
    public double b;
    public double c;

    public double area() {
        //prefixo public indica que o atributo ou metodo pode ser utilizado eu outros arquivos
        // double acima é o tipo do dado do metodo
        //() lista de parametros do metodo
        //area é o nme do metodo
        double p = (a+b+c)/2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        //corpo do metodo

    }
}
