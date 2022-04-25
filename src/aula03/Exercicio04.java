package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];


        for(int i = 0; i<numeros.length; i++){
            System.out.printf("Digite o %d Numero: %n", i+1);
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i<numeros.length; i++){
            if(numeros[i] > numeros[i+1]) {
                System.out.println(numeros[i]);
            } else {
                System.out.println(numeros[i+1]);
            }
        }

    }
}
