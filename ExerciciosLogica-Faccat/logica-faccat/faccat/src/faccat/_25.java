package faccat;

import java.util.Scanner;

public class _25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler número da conta, saldo, débito e crédito
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = entrada.nextInt();

        System.out.print("Digite o saldo da conta: ");
        double saldo = entrada.nextDouble();

        System.out.print("Sacar: ");
        double debito = entrada.nextDouble();

        System.out.print("Depositar: ");
        double credito = entrada.nextDouble();

        // Calcular saldo atual
        double saldoAtual = saldo - debito + credito;

        // Exibir saldo atual
        System.out.println("Saldo atual: R$ " + saldoAtual);

        System.out.println("Número da conta:" + numeroConta);

        // Testar se saldo atual é maior ou igual a zero e exibir mensagem correspondente
        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }
            
        entrada.close();
    }
    
}
