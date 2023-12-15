package faccat;

import java.util.Scanner;

public class _22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = entrada.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = entrada.nextDouble();

        final double horasSemanais = 40;
        final int semanasNoMes = 4;
        double salarioTotal;

        if (horasTrabalhadas <= horasSemanais * semanasNoMes) {
            // Não há horas extras
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            // Calcula as horas extras com acréscimo de 50%
            double horasExtras = horasTrabalhadas - horasSemanais * semanasNoMes;
            double salarioRegular = horasSemanais * semanasNoMes * salarioPorHora;
            double salarioHorasExtras = horasExtras * (1.5 * salarioPorHora);
            salarioTotal = salarioRegular + salarioHorasExtras;
        }

        System.out.println("Salário total: R$" + salarioTotal);

        entrada.close();
    }
}
