package aula01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();

        System.out.println("Uma pessoa com %d anos viveu pelo menos " + idade * 365 + " dias");
    }
}
