package aula06;

import java.util.Scanner;

/**Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de Renda,
 * que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que
 * o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)
 * O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor
 * da sua hora e a quantidade de horas trabalhadas no mês.
 * a. Desconto do IR;
 * b. Salário Bruto até R$900,00 (inclusive) – Isento;
 * c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
 * d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
 * e. Salário bruto acima de 2500 – Desconto de 20%.
 */

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horasTrabalhadas;
        double valorHora, salarioBruto, salarioLiquido, valorIR = 0, valorSindicato, valorFGTS;

        System.out.println("Digite as horas trabalhadas no mês:");
        horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o seu salario por hora:");
        valorHora = scanner.nextDouble();

        salarioBruto = (valorHora * horasTrabalhadas);
        valorSindicato = salarioBruto * 0.03;
        valorFGTS = salarioBruto * 0.11;

        if (salarioBruto <= 900){
            salarioLiquido = salarioBruto - valorSindicato;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            valorIR = salarioBruto * 0.05;
            salarioLiquido = salarioBruto - valorSindicato - valorIR;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500){
            valorIR = salarioBruto * 0.1;
            salarioLiquido = salarioBruto - valorSindicato - valorIR;
        } else {
            valorIR = salarioBruto * 0.2;
            salarioLiquido = salarioBruto - valorSindicato - valorIR;
        }

        System.out.println("===============================");
        System.out.printf("SALARIO      BRUTO: R$ %.2f %n", salarioBruto);
        System.out.printf("DESCONTO      I.R.: -R$ %.2f %n", valorIR);
        System.out.printf("DESCONTO SINDICATO: -R$ %.2f %n", valorSindicato);
        System.out.println("_______________________________");
        System.out.printf("SALARIO    LIQUIDO: R$ %.2f %n", salarioLiquido);
        System.out.println("_______________________________");
        System.out.printf("DEPOSITO FGTS: R$ %.2f %n", valorFGTS);


    }
}
