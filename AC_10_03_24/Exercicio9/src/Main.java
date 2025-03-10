import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o numero?");
        float xFloat = teclado.nextFloat();
        int xInteiro = (int) xFloat;

        if ((xFloat - xInteiro) >= 0.5){
            xInteiro = xInteiro + 1;
        }
        System.out.println("O número arredondado é " + xInteiro);
    }
}
