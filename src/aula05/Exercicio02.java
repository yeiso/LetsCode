package aula05;

import java.util.Scanner;

//Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numeros = new double[2][5];

        for(int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; i++){
                numeros[i][j] = scanner.nextDouble();
            }
        }

    }

}