package aula01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroUm;
        double numeroDois;

        System.out.println("Digite o primeiro numero:");
        numeroUm = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        numeroDois = scanner.nextDouble();

        System.out.printf("Soma: %.2f + %.2f = %.2f%n",numeroUm, numeroDois, numeroUm+numeroDois);
        System.out.printf("Subtracao: %.2f - %.2f = %.2f%n", numeroUm, numeroDois, numeroUm-numeroDois);
        System.out.printf("Multiplicacao: %.2f * %.2f = %.2f%n", numeroUm, numeroDois, numeroUm*numeroDois );
        System.out.printf("Divisao:  %.2f / %.2f = %.2f%n", numeroUm, numeroDois, numeroUm/numeroDois);


    }
}
