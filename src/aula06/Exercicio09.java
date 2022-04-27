package aula06;

import java.util.Scanner;

/**Faça um programa que apresente o menu de opções a seguir:
 * Menu de opções:
 * 1. Média aritmética
 * 2. Média ponderada
 * Digite a opção desejada:
 * Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
 * Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
 * Verifique a possibilidade de opção inválida, mostrando uma mensagem.
*/


public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menu;
        double nota;
        double pesoNota;
        double notasSoma = 0;
        double pesoTotalNotas = 0;


        System.out.printf("Menu de Opcoes: %n 1 - Media aritimetica. %n 2 - Media Ponderada %n");
        menu = scanner.nextInt();

        while (menu != 1 && menu != 2){
            System.out.println("Opcao invalida. Digite novamente");
            menu = scanner.nextInt();
        }

        if(menu == 1){
            for (int i = 0; i < 2; i++){
                System.out.printf("Digite a nota %d: %n", i+1);
                notasSoma += scanner.nextDouble();
            }

            System.out.printf("Media Aritimerica: %.2f. %n", (notasSoma/2) );

        } else {
            for (int i = 0; i < 3; i++){
                System.out.printf("Digite a nota %d: %n", i+1);
                nota = scanner.nextDouble();

                System.out.printf("Digite o peso da nota %d: %n", i+1);
                pesoNota = scanner.nextDouble();

                notasSoma += nota * pesoNota;
                pesoTotalNotas += pesoNota;
            }

            System.out.printf("Media Ponderada: %.2f. %n", (notasSoma/pesoTotalNotas) );

        }
    }
}
