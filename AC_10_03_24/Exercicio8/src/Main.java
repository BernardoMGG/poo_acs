import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a quantidade de kilowatts consumido?");
        float qtd = teclado.nextFloat();

        System.out.println("Qual o valor do kilowatt?");
        float valor = teclado.nextFloat();

        if(qtd < 150){
            double valorfinal = (qtd * valor)*0.9;
            System.out.println("O valor a pagar é de " + valorfinal);
        } else {
            double valorfinal = (qtd * valor);
            System.out.println("O valor a pagar é de " + valorfinal);
        }
    }
}
