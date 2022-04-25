package aula01;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        BigDecimal valorEmprestimo;
        BigDecimal valorFinal;
        int numeroParcelas;
        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor do emprestimo:");
        valorEmprestimo = scanner.nextBigDecimal();

        System.out.println("Digite o numero de parcelas:");
        numeroParcelas = scanner.nextInt();

        valorFinal = valorEmprestimo.multiply(BigDecimal.valueOf(Math.pow((1 + 0.02), numeroParcelas)));

        System.out.printf("Valor final do emprestimo em %d parcelas: R%s", numeroParcelas,df.format(valorFinal));
    }
}
