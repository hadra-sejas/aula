import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Valor da base do retangulo: ");
        int base = in.nextInt();
        System.out.println("Valor da altura do retangulo: ");
        int altura = in.nextInt();
        System.out.println();

        System.out.println("Area do retangulo= ");
        System.out.println(base * altura);

        System.out.println("Perímetro do retângulo=");
        System.out.println(base + base + altura + altura);


    }
}