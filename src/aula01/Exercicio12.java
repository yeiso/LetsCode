package aula01;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal custoProduto;
        BigDecimal percentualAcrescimo;

        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor de custo do produto:");
        custoProduto = scanner.nextBigDecimal();

        System.out.println("Digite a porcentagem de acrescimo (Para 10% digite 10):");
        percentualAcrescimo = scanner.nextBigDecimal();
        percentualAcrescimo = percentualAcrescimo.multiply(BigDecimal.valueOf(0.01));
        percentualAcrescimo = percentualAcrescimo.add(BigDecimal.valueOf(1));

        BigDecimal valorVenda = custoProduto.multiply(percentualAcrescimo);

        System.out.println("Produto com preco de custo de: R$ " + df.format(custoProduto));
        System.out.println("Valor de venda e R$ " + df.format(valorVenda));
    }
}
