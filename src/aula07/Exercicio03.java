package aula07;

import java.util.Scanner;

/**João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
 * o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes
 * maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
 * (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa
 * que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
 * Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o
 * valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 */

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double peso;
        double excesso;
        double multa;

        System.out.println("Quantos Kgs de peixe foram pescados:");
        peso = scanner.nextDouble();

        excesso = peso-50;
        multa = excesso*4;

        if (multa <= 0 ){
            System.out.println("Sem multa!");
        } else {
            System.out.printf("Valor da multa: R$ %.2f", multa);
        }
    }

}
