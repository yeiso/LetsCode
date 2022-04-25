package aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numeros[] = new double[4];
        double total = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %d° numero: %n", i+1);
            numeros[i] = scanner.nextDouble();
            total = total+(Math.pow(numeros[i], 2));
        }

        System.out.println("Total: " + total);
    }
}
