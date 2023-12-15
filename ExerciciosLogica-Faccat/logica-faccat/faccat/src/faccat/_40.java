package faccat;

import java.util.Scanner;

public class _40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricaoProduto = entrada.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidadeAdquirida = entrada.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = entrada.nextDouble();

        double total = quantidadeAdquirida * precoUnitario;
        double desconto = 0.0;

        if (quantidadeAdquirida <= 5) {
            desconto = total * 0.02;
        } else if (quantidadeAdquirida <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalPagar = total - desconto;

        System.out.println("Produto:" + descricaoProduto);
        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total com o desconto: R$" + totalPagar);

        entrada.close();
    }
}
