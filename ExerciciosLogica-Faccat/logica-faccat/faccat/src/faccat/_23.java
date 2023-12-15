package faccat;

import java.util.Scanner;

public class _23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();

        System.out.print("Digite o sexo (M ou F): ");
        char sexo = entrada.next().charAt(0);

        double pesoIdeal;
        entrada.close();
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido.");
            return; // Encerra o programa se o sexo for inválido
            
        }

        System.out.println("Peso ideal para " + nome + ": " + pesoIdeal + " kg");
       
    }
    
}
