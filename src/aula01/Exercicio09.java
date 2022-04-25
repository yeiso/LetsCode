package aula01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno;
        double notas[] = new double[3];
        double mediaNotas = 0;

        System.out.println("Digite o nome do Aluno:");
        nomeAluno = scanner.nextLine();

        for(int i = 0; i<notas.length; i++){
            System.out.printf("Digite a %d nota do Aluno: ", i+1);
            notas[i] = scanner.nextDouble();
            mediaNotas = mediaNotas + notas[i];
        }

        mediaNotas = mediaNotas / notas.length;

        System.out.printf("O aluno %s tem uma media de: %.2f%n", nomeAluno, mediaNotas);
    }
}
