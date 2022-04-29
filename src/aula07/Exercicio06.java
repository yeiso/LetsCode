package aula07;

import java.util.Scanner;

/** Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
 * da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
 * e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros,
 * que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os
 * respectivos preços em 2 situações:
 * comprar apenas latas de 18 litros
 * comprar apenas galões de 3,6 litros;
 */

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaPintar;
        int totalLatas;
        int totalGaloes;

        System.out.println("Digite a area a ser pintada, em metros quadrados:");
        areaPintar = scanner.nextDouble();

        //usando o ceil para arredondamento para cima, assim qualquer valor decimal, adciona uma unidade
        //por exemplo: se o resultado for 1,2 latas, arredondamos para 2 latas.
        totalLatas = (int) Math.ceil(areaPintar/ (6.0 * 18));
        totalGaloes = (int) Math.ceil(areaPintar/ (6.0 * 3.6));

        System.out.printf("Total de latas de tinta: %d %n Custo total: R$ %d,00 %n", totalLatas, (totalLatas*80));
        System.out.printf("Total de galoes de tinta: %d %n Custo total: R$ %d,00 %n", totalGaloes, (totalGaloes*25));
    }
}
