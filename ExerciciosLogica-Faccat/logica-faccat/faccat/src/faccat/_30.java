package faccat;

import java.util.Scanner;

public class _30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler 3 valores
        System.out.println("Digite o primeiro valor:");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entrada.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = entrada.nextInt();

        // Ordenar os valores em ordem crescente
        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3) {
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        if (valor1 > valor2) {
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
        entrada.close();
    }
}
