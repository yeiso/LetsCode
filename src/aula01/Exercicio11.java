package aula01;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal valorCompra;
        BigDecimal valorParcela;
        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor total da compra:");
        valorCompra = scanner.nextBigDecimal();

        valorParcela = valorCompra.divide(BigDecimal.valueOf(5));

        System.out.printf("Compra de R%s.%nSera dividido em 5 parcelas de R%s%n", df.format(valorCompra), df.format(valorParcela));
    }
}
