package aula05;

//Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica uma de suas linhas, e retorna a média dos valores daquela linha

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[2][2];
        int linha;
        int somaLinha = 0;

        for(int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite um valor:");
                numeros[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite uma linha para somar:");
        linha = scanner.nextInt();

        for(int i = linha; i <= linha; i++){
            for (int j = 0; j < numeros[i].length; j++){
                somaLinha += numeros[i][j];
            }
        }

        System.out.println("O valor da soma:" + somaLinha);
    }
}
