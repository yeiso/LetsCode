package aula01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        double salario;
        DecimalFormat df = new DecimalFormat("###,###.00");

        System.out.println("Digite o Salario:");
        salario = scanner.nextDouble();

        double salarioReajustado = salario * 1.07;

        System.out.println("Salario de: R$ " + df.format(salario));
        System.out.println("Salario com reajuste de 7%: R$ " + df.format(salarioReajustado));
    }
}
