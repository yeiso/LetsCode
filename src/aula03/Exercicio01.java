package aula03;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double notas[] = new double[4];
        double mediaNotas = 0;

        for(int i = 0; i<notas.length; i++){
            System.out.printf("Digite a %d nota do Aluno: %n", i+1);
            notas[i] = scanner.nextDouble();
            mediaNotas += notas[i];
        }

        mediaNotas = mediaNotas/notas.length;

        if( mediaNotas >= 7 ){
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno de Recuperacao");
        }

    }
}
