package faccat;

import java.util.Scanner;

public class _37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade (em Kg) de morangos comprados: ");
        double kgMorango = entrada.nextDouble();

        System.out.print("Digite a quantidade (em Kg) de maçãs compradas: ");
        double kgMaca = entrada.nextDouble();

        double precoMorango = (kgMorango <= 5) ? 2.50 : 2.20;
        double precoMaca = (kgMaca <= 5) ? 1.80 : 1.50;

        double valorMorango = kgMorango * precoMorango;
        double valorMaca = kgMaca * precoMaca;

        double valorTotal = valorMorango + valorMaca;

        if ((kgMorango + kgMaca) > 8 || valorTotal > 25.00) {
            double desconto = valorTotal * 0.10;
            valorTotal -= desconto;
        }

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorTotal);
        entrada.close();
    }
}