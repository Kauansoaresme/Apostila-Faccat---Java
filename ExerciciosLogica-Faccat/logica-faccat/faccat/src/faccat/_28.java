package faccat;

import java.util.Scanner;

public class _28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler 3 valores
        System.out.println("Digite o primeiro valor:");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entrada.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = entrada.nextInt();

        // Verificar e exibir o maior valor
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é: " + valor1);
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é: " + valor2);
        } else {
            System.out.println("O maior valor é: " + valor3);
        }
        entrada.close();
    }
}
