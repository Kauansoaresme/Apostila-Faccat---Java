package faccat;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você pode votar este ano!");
        } else {
            System.out.println("Você não pode votar este ano. A idade mínima é 16 anos.");
        }
        entrada.close();
    }
}
