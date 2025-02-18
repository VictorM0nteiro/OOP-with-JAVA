import java.util.Scanner;
import java.util.Locale;
public class Exer2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float num, maior = 0, segundoMaior = 0, aux=0;


        for(int i=0 ;i<10;i++){
            System.out.print("Digite um numero: ");
            num = sc.nextFloat();
            if(i == 0) {
                maior = num;
            }
            else if(i == 1){
                segundoMaior = num;
                if(segundoMaior>maior){
                    aux = segundoMaior;
                    segundoMaior = num;
                    num = aux;
                }
            }
            else if(num>maior){
                maior = num;
            }
            else if(num>segundoMaior){
                segundoMaior = num;
            }
        }
        System.out.println("Maior: "+maior);
        System.out.println("Segundo: "+segundoMaior);
        sc.close();
    }
}
