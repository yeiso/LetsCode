package aula03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        //A primeira vez executando o programa o 0 é apenas processado.
        do{
            System.out.println("Digite um numero:");
            numero = scanner.nextInt();
            if( numero > 0){
                System.out.println("Numero positivo");
            } else if (numero < 0) {
                System.out.println("Numero positivo");
            } else {
                System.out.println("Voce digitou 0");
            }
            System.out.println("Digite 0 para sair");
        } while ( numero != 0);
    }
}
