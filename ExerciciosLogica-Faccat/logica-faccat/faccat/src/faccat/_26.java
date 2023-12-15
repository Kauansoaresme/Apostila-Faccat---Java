package faccat;

import java.util.Scanner;

public class _26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler quantidade atual em estoque, quantidade máxima e mínima em estoque
        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = entrada.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = entrada.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = entrada.nextInt();

        // Calcular quantidade média
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        // Verificar se a quantidade em estoque é maior ou igual à quantidade média e exibir mensagem correspondente
        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
        entrada.close();
    }
}
