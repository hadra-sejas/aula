import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do seu salário mensal:");
        int salario = in.nextInt();
        System.out.println("Informe o percentual de reajuste:");
        float percentual = in.nextInt();

        System.out.println("Seu salário agora será de: ");
        System.out.println((percentual / 100) * salario + salario);

    }

}