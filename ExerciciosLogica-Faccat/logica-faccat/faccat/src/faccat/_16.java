package faccat;

import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int qtdMacas = entrada.nextInt();

        double custoUnitario;

        if (qtdMacas < 12) {
            custoUnitario = 1.30;
        } else {
            custoUnitario = 1.00;
        }

        double custoTotal = qtdMacas * custoUnitario;

        System.out.println("Custo total da compra: R$ " + custoTotal);
        entrada.close();
    }
}
