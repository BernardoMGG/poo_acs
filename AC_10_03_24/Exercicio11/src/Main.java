import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um operação matemática (+, -, *, /): ");
        char op = teclado.nextLine().charAt(0);

        System.out.println("Digite um numero");
        float x1 = teclado.nextFloat();

        System.out.println("Digite outro numero:");
        float x2 = teclado.nextFloat();

        switch (op){
            case '+': System.out.println(x1 + " " + op + " " + x2 + " = " + (x1 + x2));
                break;
            case '-': System.out.println(x1 + " " + op + " " + x2 + " = " + (x1 - x2));
                break;
            case '*': System.out.println(x1 + " " + op + " " + x2 + " = " + (x1 * x2));
                break;
            case '/': System.out.println(x1 + " " + op + " " + x2 + " = " + (x1 / x2));
                break;
        }
    }
}