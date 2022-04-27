package aula06;

import java.util.Scanner;

/**Calcular a quantidade de dinheiro gasta por um fumante.
 * Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20 cigarros.
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalAnosFumando;
        int cigarrosPorDia;
        double precoCarteira;

        System.out.println("Digite a quantos anos voce fuma:");
        totalAnosFumando = scanner.nextInt();

        System.out.println("Digite quantos cigarros voce fuma por dia:");
        cigarrosPorDia = scanner.nextInt();

        System.out.println("Digite o preco de uma carteira de cigarros:");
        precoCarteira = scanner.nextInt();

        System.out.printf("Voce gastou aproximadamente: R$ %.2f", (precoCarteira / cigarrosPorDia) * (totalAnosFumando * 365));


    }
}
