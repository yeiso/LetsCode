package aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeAluno;
        String turmaAluno;
        double notas[] = new double[3];
        double mediaNotas = 0;

        System.out.println("Digite o nome do Aluno:");
        nomeAluno = scanner.nextLine();

        System.out.println("Digite a turma do Aluno:");
        turmaAluno = scanner.nextLine();

        for(int i = 0; i<notas.length; i++){
            System.out.printf("Digite a %d notas do Aluno: ", i+1);
            notas[i] = scanner.nextDouble();
            mediaNotas = mediaNotas + notas[i];
        }

        mediaNotas = mediaNotas / notas.length;

        System.out.printf("O aluno %s, da turma %s, tem uma media de: %.2f%n", nomeAluno, turmaAluno, mediaNotas);


    }
}
