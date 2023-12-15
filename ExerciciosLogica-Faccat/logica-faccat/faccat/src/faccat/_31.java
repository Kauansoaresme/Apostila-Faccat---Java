package faccat;

import java.util.Scanner;

public class _31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler os valores dos lados do triângulo
        System.out.println("Digite o valor do lado A:");
        double ladoA = entrada.nextDouble();

        System.out.println("Digite o valor do lado B:");
        double ladoB = entrada.nextDouble();

        System.out.println("Digite o valor do lado C:");
        double ladoC = entrada.nextDouble();


        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
            System.out.println("Os valores representam as medidas dos lados de um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
        entrada.close();
        
    }
}
