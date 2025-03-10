import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a quantidade de alunos?");
        int alunos = teclado.nextInt();

        int somanotas = 0;

        for (int i = 0; i <= alunos; i++){
            System.out.println("Qual foi nota do aluno de 0 a 100?");
            int temp = teclado.nextInt();
            somanotas = somanotas + temp;
        }
        System.out.println("A média da turma é: " + (somanotas / alunos));
    }
}