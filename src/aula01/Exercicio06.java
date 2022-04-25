package aula01;

import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal real;
        BigDecimal cotacaoDolar = new BigDecimal("4.7");
        BigDecimal cotacaoEuro = new BigDecimal("5.11");
        BigDecimal cotacaoLibra = new BigDecimal("6.12");

        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor em Reais:");
        real = scanner.nextBigDecimal();

        BigDecimal dolar =  real.multiply(cotacaoDolar);
        BigDecimal euro =  real.multiply(cotacaoEuro);
        BigDecimal libra =  real.multiply(cotacaoLibra);


        System.out.println("Valor em Dolar: US" + df.format(dolar));
        System.out.println("Valor em Euro: EU" + df.format(euro));
        System.out.println("Valor em Libra: LI" + df.format(libra));
    }
}
