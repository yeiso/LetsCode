package aula01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double massa;
        double altura;
        double tempo;

        System.out.println("Digite a massa em Kilogramas:");
        massa = scanner.nextDouble();

        System.out.println("Digite a altura em Metros:");
        altura = scanner.nextDouble();

        System.out.println("Digite o tempo em Segundos:");
        tempo = scanner.nextDouble();

        double cavalos = (massa * altura / tempo) / 745.6999;

        System.out.format("Para levantar %.2f Kg a %.2f m de altura em %.2f segundos, sao necessarios: %.2f Cavalos", massa, altura, tempo, cavalos );
    }
}
