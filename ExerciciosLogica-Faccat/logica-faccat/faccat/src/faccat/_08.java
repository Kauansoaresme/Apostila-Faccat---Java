package faccat;

import java.util.Scanner;

public class _08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totEleitores = entrada.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = entrada.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = entrada.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = entrada.nextInt();

        calcularPercentuais(totEleitores, votosBrancos, votosNulos, votosValidos);

        entrada.close();
    }

    private static void calcularPercentuais(int totalEleitores, int votosBrancos, int votosNulos, int votosValidos) {
        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");
    }
}
