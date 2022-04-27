package aula05;

// Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
// Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$1.500,00
// mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salarioTotal;
        final double LIMITE_COMISSA_BASICA = 1500;

        System.out.println("Digite o salario fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas do vendedor:");
        double totalVendas = scanner.nextDouble();

        if(totalVendas <= LIMITE_COMISSA_BASICA ){
            salarioTotal = salarioFixo + (totalVendas * 0.03);
        } else {
            salarioTotal = salarioFixo + (LIMITE_COMISSA_BASICA * 0.03) + ((totalVendas - LIMITE_COMISSA_BASICA) * 0.05);
        }
        System.out.printf("Salario total: R$ %.2f", salarioTotal);
    }
}
