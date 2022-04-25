package aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distanciaPercorrida;
        double combustivelGasto;

        System.out.println("Digite a distancia percorrida em Kms: ");
        distanciaPercorrida = scanner.nextDouble();

        System.out.println("Digite o combustivel gasto em litros: ");
        combustivelGasto = scanner.nextDouble();

        double mediaKmLitro = (distanciaPercorrida / combustivelGasto);
        System.out.printf("O Carro fez em media %.2f Km/L", mediaKmLitro);
    }
}
