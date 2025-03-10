//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float salario;
        float aumento;
        float salariofinal;

        System.out.println("Qual seu salário? ");
        salario = teclado.nextFloat();

        System.out.println("Qual o aumento: ");
        aumento = teclado.nextInt();

        salariofinal = salario + (salario * (aumento / 100));
        System.out.println("O seu salário final já com aumento é: ");
        System.out.println(salariofinal);
    }
}
