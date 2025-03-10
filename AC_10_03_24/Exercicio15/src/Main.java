import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        while (true) {
            System.out.println("Digite caracteres ('.' para encerrar):");
            char caractere = scanner.next().charAt(0);

            if (caractere == '.') {
                break;
            }

            if (caractere >= '0' && caractere <= '9') {
                digitos++;
            } else if (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U' ||
                    caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                vogais++;
            } else {
                outros++;
            }
        }
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de dígitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);
    }
}

