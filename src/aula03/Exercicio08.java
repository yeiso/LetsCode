package aula03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int menorNumero = 0;
        int maiorNumero = 0;
        int validaPositivo;
        double media = 0;

        for (int i = 0; i < numeros.length;){
            System.out.printf("Digite o %d valor:%n", i+1);
            validaPositivo = scanner.nextInt();

            if (validaPositivo < 0) {
                System.out.println("Numero negativo. Por favor insira um numero positivo");
            } else {
                numeros[i] = validaPositivo;
                media += numeros[i];
                if (i == 0) {
                    menorNumero = numeros[i];
                } else if (menorNumero > numeros[i]) {
                    menorNumero = numeros[i];
                }

                if (numeros[i] > maiorNumero) {
                    maiorNumero = numeros[i];
                }
                i++;
            }
        }

        media = media/numeros.length;

        System.out.println("Maior numero: " + maiorNumero);
        System.out.println("Menor numero: " + menorNumero);
        System.out.println("Media: " + media);

    }
}
