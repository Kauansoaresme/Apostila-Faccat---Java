package faccat;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = entrada.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = entrada.nextDouble();

        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }
        entrada.close();
    }
}
