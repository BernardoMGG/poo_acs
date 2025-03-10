import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        float x1;
        float x2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual um número? ");
        x1 = teclado.nextFloat();

        System.out.println("Qual outro número? ");
        x2 = teclado.nextFloat();

        System.out.println("A soma deles é: ");
        System.out.println(x1 + x2);

        System.out.println("A subtração deles é: ");
        System.out.println(x1 - x2);

        System.out.println("A multiplicação deles é: ");
        System.out.println(x1 * x2);

        System.out.println("A divisão deles é: ");
        System.out.println(x1 / x2);
    }
}
