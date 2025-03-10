import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual foi a distancia? ");
        float distancia = teclado.nextLong();

        System.out.println("Qual foi o tempo gasto em horas?");
        float tempo = teclado.nextFloat();

        System.out.println("Quanto foi o consumo de gasolina?");
        float gasolina = teclado.nextFloat();

        float velocidade = distancia/tempo;
        float consumo = distancia/gasolina;

        System.out.println("A velocidade média em Km/H foi:" + velocidade);
        System.out.println("O consumo de gasolina em Km/L foi:" + consumo);
    }
}

