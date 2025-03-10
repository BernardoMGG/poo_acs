import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int x1 = teclado.nextInt();

        System.out.println("Digite um numero:");
        float x2 = teclado.nextFloat();

        System.out.println("Diga outro numero:");
        float x3 = teclado.nextFloat();

        float x4 = 0;

        if (x2 < x3){
           x4 = x2;
           x2 = x3;
           x3 = x4;
        }

        if(x1 > x2){
            System.out.println("Número fora do intervalo");
        } else if (x1 < x3) {
            System.out.println("Número fora do intervalo");
        } else {
            System.out.println("Número dentro do intervalo");
        }
    }
}