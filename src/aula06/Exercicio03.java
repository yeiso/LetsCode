package aula06;

import java.util.Scanner;

/** Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
 * “Telefonou para a vítima? “
 * “Esteve no local do crime?”
 * “Mora perto da vítima? “
 * “Devia para a vítima? “
 * “Já trabalhou com a vítima? “
 * Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
 * entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário,
 * ela será classificada como “Inocente”.
 **/
public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?",
                "Devia para a vítima?", "Já trabalhou com a vítima?"};
        char resposta;
        int qtdeRespostasPositivas = 0;

        System.out.println("Responda com S ou N as seguintes perguntas.");
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            resposta = scanner.nextLine().charAt(0);
            while (resposta != 'S' && resposta != 'N' && resposta != 's' && resposta != 'n') {
                System.out.println("Resposta invalida. Responda com S ou N");
                System.out.println(pergunta);
                resposta = scanner.nextLine().charAt(0);
            }
            if (resposta == 'S' || resposta == 's') {
                qtdeRespostasPositivas++;
            }
        }

        switch (qtdeRespostasPositivas) {
            case 2 -> System.out.println("Suspeita");
            case 3, 4 -> System.out.println("Cumplice");
            case 5 -> System.out.println("Culpado");
            default -> System.out.println("Inocente");
        }

    }
}
