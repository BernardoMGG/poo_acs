import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final float pi = 3.14f;
        float raio;
        float perimetro;
        float area;

        System.out.println("Qual o raio do circulo? ");
        raio = teclado.nextFloat();

        perimetro = raio * 2 * pi;
        System.out.println("O perímetro é de : " + perimetro);

        area = raio * raio * pi;
        System.out.println("A área é de: " + area);
    }
}
