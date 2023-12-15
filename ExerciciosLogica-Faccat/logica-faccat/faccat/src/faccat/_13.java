package faccat;

import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double notaUm = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double notaDois = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double notaTres = entrada.nextDouble();

        double mediaFinal = calcularMediaFinal(notaUm, notaDois, notaTres);

        System.out.println("A média final é: " + mediaFinal);

        entrada.close();
    }

    private static double calcularMediaFinal(double nota1, double nota2, double nota3) {
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }
}
