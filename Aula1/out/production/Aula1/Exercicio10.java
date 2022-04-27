import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        int n1 = in.nextInt();
        System.out.println("Informe a segunda nota:");
        int n2 = in.nextInt();
        System.out.println("Informe a terceira nota:");
        int n3 = in.nextInt();

        System.out.println("Sua media final é de:");
        System.out.println((n1 * 2 + n2 * 3 + n3 * 5) / 10);
    }
}
