package aula02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tempoGasto;
        double velocidadeMedia;

        System.out.println("Digite o tempo gasto:");
        tempoGasto = scanner.nextDouble();

        System.out.println("Digite a velocidade media:");
        velocidadeMedia = scanner.nextDouble();

        double distanciaTotal = tempoGasto * velocidadeMedia;
        double litrosUsados = distanciaTotal/12;

        System.out.println("Litros usados: " + litrosUsados);
    }
}
