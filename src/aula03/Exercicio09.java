package aula03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        int validaIdade;
        int contador = 0;

        for (int i = 0; i < idades.length;){

            System.out.printf("Digite a idade da pessoa %d: %n", i+1);
            validaIdade = scanner.nextInt();

            if(validaIdade >= 0){
                idades[i] = validaIdade;

                if(idades[i] > 18){
                    contador++;
                }
                i++;
            } else {
                System.out.println("Idades negativas não são validas. Digite novamente.");
            }

        }
        System.out.printf("Total de %d pessoas com mais de 18 anos.", contador);
    }
}
