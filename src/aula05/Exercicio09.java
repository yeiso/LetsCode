package aula05;

/* Crie um programa que preencha uma matriz de 3x5 com números inteiros. Em seguida faça:
   - some cada uma das linhas armazenando o resultado em um vetor;
   - some cada uma das colunas armazenando o resultado em um vetor;
   - imprima o resultado da soma das linhas;
   - imprima o resultado da soma das coluna;
   - imprima a matriz completa
*/


import java.util.Random;

public class Exercicio09 {
    public static void main(String[] args) {

        int matrix[][] = new int[3][5];
        int somaLinhas[] = new int[3];
        int somaColunas[] = new int[5];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < matrix.length; i++){
            somaLinhas[i] = 0;
            for (int j = 0; j < matrix[i].length; j++){
                somaLinhas[i] += matrix[i][j];
            }
        }

        for (int i = 0; i < somaColunas.length; i++){
            for (int j = 0; j < matrix.length; j++){
                somaColunas[i] += matrix[j][i];
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%d |", matrix[i][j]);
            }
            System.out.printf("%n");
        }

        System.out.println("Soma Linhas: ");
        for (int j = 0; j < somaLinhas.length; j++){
            System.out.printf("Linha %d: %d %n", j, somaLinhas[j]);
        }

        System.out.printf("Soma Colunas: %n");
        for (int j = 0; j < somaColunas.length; j++){
            System.out.printf("Coluna %d: %d %n", j, somaColunas[j]);
        }

    }
}
