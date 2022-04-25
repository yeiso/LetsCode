package aula05;

//Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numeros = new double[2][2];
        double somaNumero = 0;

        for(int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = scanner.nextDouble();

                somaNumero = somaNumero + numeros[i][j];
            }
        }
    }
}
