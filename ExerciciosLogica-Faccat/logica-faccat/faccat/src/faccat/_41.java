package faccat;

import java.util.Scanner;

public class _41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota N1: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite a nota N2: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite a nota N3: ");
        double num3 = entrada.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = entrada.nextDouble();

        double mediaAproveitamento = (num1 + num2 * 2 + num3 * 3 + mediaExercicios) / 7;

        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito: A");
        } else if (mediaAproveitamento >= 7.5) {
            System.out.println("Conceito: B");
        } else if (mediaAproveitamento >= 6.0) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }
        entrada.close();
    }
}
