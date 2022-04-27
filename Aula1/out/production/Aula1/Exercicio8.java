import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o numero de carros vendidos:");
        int carros = in.nextInt();
        System.out.println("Informe o valor total das suas vendas:");
        int vt = in.nextInt();
        System.out.println("Informe o seu salario fixo:");
        int sal = in.nextInt();
        System.out.println("Informe a comissao por carro vendido:");
        int com1 = in.nextInt();
        float com2 = 5;

        System.out.println("Seu salario final sera de:");
        System.out.println(com2 / 100 * vt + com1 * carros + sal);

    }
}
