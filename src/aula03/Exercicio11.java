package aula03;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        int aux;

        System.out.println("Digite o primeiro numero:");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = scanner.nextInt();

        if (numero1 > numero2){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        System.out.println("=================================");
        for (int i = numero1+1; i < numero2; i++){
            System.out.printf("%d%n", i);
        }
    }
}
