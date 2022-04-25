package aula03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor;
        int fatorial = 1;

        System.out.println("Digite o valor para o fatorial:");
        valor = scanner.nextInt();

        for (int i = 1; i <= valor; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }
}
