package aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double custoFabrica;
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor de custo do carro:");
        custoFabrica = scanner.nextDouble();

        double valorVenda = custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);

        System.out.println("Valor de venda ao cliente: R$ " + df.format(valorVenda));
    }
}
