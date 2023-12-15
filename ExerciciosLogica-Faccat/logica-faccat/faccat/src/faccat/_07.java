package faccat;

import java.util.Scanner;

public class _07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = entrada.nextInt();
        System.out.print("Digite a idade em meses: ");
        int meses = entrada.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = entrada.nextInt();

        int idadeEmDias = calcularIdadeDias(anos, meses, dias);

        System.out.println("A idade em dias é: " + idadeEmDias + " dias");

        entrada.close();
    }

    private static int calcularIdadeDias(int anos, int meses, int dias) {
        return (anos * 365) + (meses * 30) + dias;
    }
}
