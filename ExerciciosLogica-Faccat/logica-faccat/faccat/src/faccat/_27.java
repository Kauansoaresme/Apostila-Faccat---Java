package faccat;

import java.util.Scanner;

public class _27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler um valor
        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        // Verificar se o valor é positivo, negativo ou zero e exibir mensagem correspondente
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }
        entrada.close();
    }
}
