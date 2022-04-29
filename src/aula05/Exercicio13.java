package aula05;

import java.util.Scanner;

/**Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * Álcool
 * até 20 litros, desconto de 3% por litro
 * acima de 20 litros, desconto de 5% por litro
 * Gasolina
 * até 20 litros, desconto de 4% por litro
 * acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte
 * forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do
 * litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20
 */
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char tipoCombustivel;
        double litrosCombustivel;
        double valorTotal;

        System.out.printf("Qual o combustivel: %nG - Gasolina %nA - Alcool %n");
        tipoCombustivel = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Quantos litros:");
        litrosCombustivel = scanner.nextDouble();

        if (tipoCombustivel == 'A'){
            if (litrosCombustivel <= 20){
                valorTotal = (litrosCombustivel * 5.2) * 0.97;
            } else{
                valorTotal = (litrosCombustivel * 5.2) * 0.95;
            }
        } else {
            if (litrosCombustivel <= 20){
                valorTotal = (litrosCombustivel * 7.59) * 0.96;
            } else{
                valorTotal = (litrosCombustivel * 7.59) * 0.94;
            }
        }
        System.out.println("============================================");
        System.out.println("RECIBO");
        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    }
}
