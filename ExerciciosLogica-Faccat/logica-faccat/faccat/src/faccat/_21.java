package faccat;

import java.util.Scanner;

public class _21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo (inteiro): ");
        int horaInicio = entrada.nextInt();

        System.out.print("Digite a hora de fim do jogo (inteiro): ");
        int horaFim = entrada.nextInt();

        int duracao;

        if (horaFim > horaInicio) {
            // Mesmo dia
            duracao = horaFim - horaInicio;
        } else {
            // Jogo passa para o dia seguinte
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("Duração do jogo: " + duracao + " horas");
        entrada.close();
    }
    
}
