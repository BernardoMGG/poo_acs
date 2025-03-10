import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos segundos? ");
        long segundos = teclado.nextLong();

        long horas = segundos/3600;
        long restoMinutos = (segundos - horas * 3600);
        long minutos = restoMinutos/60;
        long segrestantes = segundos-(minutos*60 + horas * 3600);

        System.out.println("Em horas:" + horas);
        System.out.println("Em minutos:" + minutos);
        System.out.println("Em segundos:" + segrestantes);
    }
}
