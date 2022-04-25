package aula05;

//Escreva um código que leia um vetor G de 10 elementos do tipo caracter que representa o gabarito de uma prova.
// A seguir, para cada um dos 10 alunos da turma, leia o vetor de respostas (R) do aluno e conte o número de acertos.
// Mostre o número de acertos do aluno e uma mensagem APROVADO, se a nota for maior ou igual a 6;
// e mostre uma mensagem de REPROVADO, caso contrário.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Character gabarito[] = new Character[10];
        Character respostasAluno[][] = new Character[10][10];
        int nota;
        int comparaChar;

        for(int i = 0; i < gabarito.length; i++){
            System.out.printf("Digite a resposta da questao %d: %n", i+1);
            gabarito[i] = scanner.nextLine().charAt(0);
        }

        for(int i = 0; i < respostasAluno.length; i++){
            for(int j = 0; j < respostasAluno[i].length; j++){
                System.out.printf("Digite a resposta do aluno %d para a questao %d:%n", i, j);
                respostasAluno[i][j] = scanner.nextLine().charAt(0);
            }
        }

        for(int i = 0; i < respostasAluno.length; i++){
            nota = 0;
            for(int j = 0; j < respostasAluno[i].length; j++){
                comparaChar = Character.compare(gabarito[j], respostasAluno[i][j]);
                if(comparaChar == 0){
                    nota++;
                }
            }
            System.out.printf("Aluno %d - Nota: %d -", i+1, nota);
            System.out.printf(nota >= 6? " Aprovado. %n" : " Reprovado. %n");
        }





    }
}
