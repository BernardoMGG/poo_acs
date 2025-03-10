import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int a = teclado.nextInt();

        System.out.println("Digite outro numero:");
        int b = teclado.nextInt();

        int soma = 0;
        int cont = 0;

        if(a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    soma = soma + i;
                    cont = cont + 1;
                    System.out.println(i);
                }
            }
        } else {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    soma = soma + i;
                    cont = cont + 1;
                    System.out.println(i);
                }
            }
        }
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + (soma/cont));
    }
}