package faccat;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        if (valor >= 0) {
            System.out.println("É POSITIVO!");
        } else {
            System.out.println("É NEGATIVO!");
        }
        entrada.close();
    }
    
}