import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o total de eleitores:");
        int eleitores = in.nextInt();
        System.out.println("Informe o total de votos nulos:");
        int nulos = in.nextInt();
        System.out.println("Informe o total de votos brancos:");
        int brancos = in.nextInt();
        System.out.println("Total de votos válidos:");
        System.out.println(eleitores - nulos - brancos);
        System.out.println("Percentual de votos válidos:");
        System.out.println((eleitores * 100) / (eleitores - nulos - brancos));
        System.out.println("Percentual nulos :");
        System.out.println((nulos * 100) / eleitores);
        System.out.println("Percentual brancos:");
        System.out.println((brancos * 100) / eleitores);

    }
}
