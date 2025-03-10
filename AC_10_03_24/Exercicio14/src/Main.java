import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota (-1 para encerrar):");
        float nota = teclado.nextFloat();

        if (nota == -1) {
            return;
        }

        int alunos = 1;
        float somanotas = nota;
        float maiornota = nota;
        float menornota = nota;

        while (true) {
            System.out.println("Digite a próxima nota (-1 para encerrar):");
            float novaNota = teclado.nextFloat();

            if (novaNota == -1) {
                break;
            }

            if (novaNota < 0 || novaNota > 10) {
                System.out.println("Nota inválida. Digite novamente.");
                continue;
            }

            alunos++;
            somanotas += novaNota;

            if (novaNota > maiornota) {
                maiornota = novaNota;
            }
            if (novaNota < menornota) {
                menornota = novaNota;
            }
        }

        float media = somanotas / alunos;
        System.out.println("Quantidade de Alunos: " + alunos);
        System.out.println("Média da Turma: " + media);
        System.out.println("Maior Nota: " + maiornota);
        System.out.println("Menor Nota: " + menornota);
    }
}
