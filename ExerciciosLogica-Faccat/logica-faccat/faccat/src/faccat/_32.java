package faccat;

import java.util.Scanner;

public class _32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o nome do time 1:");
        String time1 = entrada.nextLine();

        System.out.println("Digite o nome do time 2:");
        String time2 = entrada.nextLine();


        System.out.println("Digite o número de gols do " + time1 + ":");
        int golsTime1 = entrada.nextInt();

        System.out.println("Digite o número de gols do " + time2 + ":");
        int golsTime2 = entrada.nextInt();


        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }
        entrada.close();
    }
}
