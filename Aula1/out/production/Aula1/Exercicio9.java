import java.util.Scanner;

public class 1Exercicio9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit:");
        int f = in.nextInt();

        System.out.println("Essa é a temperatura correspondente em graus Celsius:");
        System.out.println((f - 32) / 9 * 5);
    }
}
