package faccat;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = entrada.nextDouble();

        double custoFinal = calcularCustoFinal(custoFabrica);

        System.out.println("O custo final ao consumidor é: " + custoFinal);

        entrada.close();
    }

    private static double calcularCustoFinal(double custoFabrica) {
        // Definindo percentuais
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Calculando custo final
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        return custoFinal;
    }
}