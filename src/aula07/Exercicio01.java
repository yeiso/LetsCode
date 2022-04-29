package aula07;

import java.util.Scanner;

/**Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
 * No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
 * O seu resultado fica sendo a média dos três valores restantes. Você deve fazer um
 * programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos
 * e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor
 * e o pior salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos.
 * Os saltos são informados na ordem da execução, portanto não são ordenados.
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] distanciSaltos = new double[5];
        double mediaSaltos = 0;
        int melhorSalto = 0;
        int piorSalto = 0;
        String nomeAtleta;

        do {
            System.out.println("Digite o nome do atleta:");
            nomeAtleta = scanner.nextLine();

            if(nomeAtleta.equals("")){
                System.out.println("Programa Encerrado!");
                break;
            }

            for (int i = 0; i < distanciSaltos.length; i++) {
                System.out.printf("Digite o a distancia do salto %d:", i + 1);
                distanciSaltos[i] = scanner.nextDouble();

                mediaSaltos += distanciSaltos[i];
                if (distanciSaltos[i] >= distanciSaltos[melhorSalto]) {
                    melhorSalto = i;
                }
                if (distanciSaltos[i] < distanciSaltos[piorSalto]) {
                    piorSalto = i;
                }
            }
            scanner.nextLine();
            mediaSaltos = (mediaSaltos - distanciSaltos[melhorSalto] - distanciSaltos[piorSalto]) / 3;

            System.out.println("========================================");
            System.out.printf("Atleta: %s %n", nomeAtleta);
            for (int i = 0; i < distanciSaltos.length; i++) {
                System.out.printf("%d Salto: %.2f m%n", i+1,distanciSaltos[i]);
            }
            System.out.printf("Melhor salto: %.2f m%n", distanciSaltos[melhorSalto]);
            System.out.printf("Pior salto: %.2f m%n", distanciSaltos[piorSalto]);
            System.out.printf("Media dos outros 3 saltos: %.2f m%n", mediaSaltos);
            System.out.println("========================================");
        } while (true);
    }
}
