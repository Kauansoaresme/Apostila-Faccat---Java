package faccat;

import java.util.Scanner;

public class _35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        double litro = entrada.nextDouble();

        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = entrada.next().charAt(0);

        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double precoLitro = 0;
        double desconto = 0;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoLitro = precoAlcool;

            if (litro <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoLitro = precoGasolina;

            if (litro <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        }

        double valorTotal = litro * precoLitro;
        double valorDesconto = valorTotal * desconto;
        double valorFinal = valorTotal - valorDesconto;

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorFinal);
        entrada.close();
    }
}