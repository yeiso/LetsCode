package aula05;

import java.util.Scanner;

/**Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar
 * os nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de
 * mais 1 nome qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome
 * estiver entre os 10 nomes lidos
 */

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        String nomeBuscar;
        int verificador = 0;

        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Digite o nome da pessoa %d: ", i+1);
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome para buscar: ");
        nomeBuscar = scanner.nextLine();

        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBuscar)) {
                verificador++;
            }
        }

        if (verificador > 0){
            System.out.printf("ACHEI! %d registros %n", verificador);
        } else {
            System.out.println("NAO ACHEI!");
        }


    }
}
