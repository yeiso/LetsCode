package aula05;

 //Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numeros = new double[2][2];
        double maiorNumero = 0;

        for(int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                numeros[i][j] = scanner.nextDouble();

                if(i == 0 && j ==0) {
                    maiorNumero = numeros[i][j];
                }

                if(numeros[i][j] > maiorNumero){
                    maiorNumero = numeros[i][j];
                }
            }
        }

        System.out.println("O maior numero da matriz: " + maiorNumero);

    }
}
