package aula07;

import java.util.Scanner;

/**Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
 * em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
 * é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
 * 18 litros, que custam R$ 80,00. Informe ao usuário a quantidade de latas de
 * tinta a serem compradas e o preço total.
 */

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double areaPintar;
        int totalLatas;

        System.out.println("Digite a area a ser pintada, em metros quadrados:");
        areaPintar = scanner.nextDouble();

        totalLatas = (int) Math.ceil(areaPintar/ (3.0 * 18));

        System.out.printf("Total de latas de tinta: %d %n Custo total: R$ %d,00", totalLatas, (totalLatas*80));

    }
}
