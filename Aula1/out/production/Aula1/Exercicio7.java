import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o custo de fabrica:");
        int fabrica = in.nextInt();
        float distribuidor = 28;
        float impostos = 45;

        System.out.println("O custo final do carro sera de:");
        System.out.println(distribuidor / 100 * fabrica + impostos / 100 * fabrica + fabrica);



    }
}
