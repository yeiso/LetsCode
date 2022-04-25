package aula01;


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        System.out.println("Digite a temperatura em graus celsius:");
        celsius = scanner.nextDouble();

        double kelvin = (celsius + 273.15);
        double fahrenheit = (celsius * 1.8 + 32);
        double rankine = (celsius * 1.8 + 32 + 459.67);
        double reaumur = (celsius * 0.8);

        System.out.printf("Graus Celsius: %.2f%n", celsius );
        System.out.printf("Graus Kelvin: %.2f%n", kelvin);
        System.out.printf("Graus Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Graus Rankine: %.2f%n", rankine);
        System.out.printf("Graus Reaumur: %.2f%n", reaumur);
    }
}
