
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroInicial = 0, numeroFinal = 0;
        int razao;
        Scanner sc = new Scanner(System.in);
        numeroInicial = sc.nextInt();
        razao = sc.nextInt();
        while (numeroFinal != 19) {
            System.out.println(numeroInicial);
            numeroInicial = numeroInicial + razao;
            System.out.println(numeroInicial);
            numeroFinal++;
        }
    }
}
