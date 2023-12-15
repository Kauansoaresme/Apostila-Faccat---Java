package faccat;

import java.util.Scanner;

public class _42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNasc = entrada.nextInt();

        System.out.print("Digite o ano de ingresso na empresa do empregado: ");
        int anoIngresso = entrada.nextInt();

        int idade = 2023 - anoNasc;
        int tempoTrabalho = 2023 - anoIngresso;

    
        System.out.println("Idade do empregado: " + idade + " anos.");
        System.out.println("Tempo de trabalho na empresa: " + tempoTrabalho + " anos.");

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não podera requer a aposentadoria");
        }
        entrada.close();
    }
}
