package faccat;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = entrada.nextDouble();

        double temperaturaCelsius = converterFahrenheitParaCelsius(temperaturaFahrenheit);

        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
        
        entrada.close();
    }

    private static double converterFahrenheitParaCelsius(double temperaturaFahrenheit) {
        // Fórmula de conversão de Fahrenheit para Celsius
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }
}
