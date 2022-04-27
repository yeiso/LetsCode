package aula06;

import java.util.Scanner;

/** Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
 * A quantidade de pessoas com mais de 90 quilos;
 * A média das idades das sete pessoas;
 */

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade = 0, contador = 0;
        double peso;

        for (int i = 0; i < 7; i++){
            System.out.println("Digite seu peso em Kg:");
            peso = scanner.nextDouble();

            System.out.println("Digite sua idade:");
            idade += scanner.nextInt();

            if (peso > 90) {
                contador++;
            }
        }

        System.out.printf("%d pessoas com mais de 90Kg. %n", contador);
        System.out.printf("A media de idade: %d anos. %n", (idade/7) );
    }
}
