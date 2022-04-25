package aula01;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigDecimal valorDeposito;
        DecimalFormat df = new DecimalFormat("$###,###.00");

        System.out.println("Digite o valor do deposito:");
        valorDeposito = scanner.nextBigDecimal();

        while(valorDeposito.compareTo(BigDecimal.ZERO) <= 0){
            System.out.format("O valor do deposito nao pode ser negativo ou igual a zero.%nDigite novamente: %n");
            valorDeposito = scanner.nextBigDecimal();
        }

        BigDecimal valorReajustado = valorDeposito.multiply(BigDecimal.valueOf(1.007));

        System.out.printf("Valor depositado apos 1 mes na poupanca: R%s", df.format(valorReajustado));
    }
}
