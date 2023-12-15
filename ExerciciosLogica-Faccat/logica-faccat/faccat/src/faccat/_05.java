package faccat;

import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = entrada.nextInt();

        int antecessor = num - 1;

        System.out.println("Número Antecessor: " + num + " é " + antecessor);

        entrada.close();
    }
}
