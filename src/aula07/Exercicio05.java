package aula07;

import java.util.Scanner;

/** Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 * utilizando as seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7
 */

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double altura;
        double pesoIdealHomem;
        double pesoIdealMulher;

        System.out.println("Digite sua altura:");
        altura = scanner.nextDouble();

        pesoIdealHomem = (72.7*altura) - 58;
        pesoIdealMulher = (62.1*altura) - 44.7;

        System.out.printf("Peso ideal em relacao a altura: %nHomens: %.2f Kg %nMulheres %.2f Kg", pesoIdealHomem, pesoIdealMulher);

    }
}
