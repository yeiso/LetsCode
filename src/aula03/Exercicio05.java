package aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double peso;
        double altura;
        double imc;

        System.out.println("Digite a altura ");
        altura = scanner.nextDouble();

        System.out.println("Digite o peso ");
        peso = scanner.nextDouble();

        imc = peso / (altura * altura);

        if( imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if( imc > 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        } else if( imc > 24.9 && imc <= 29.99){
            System.out.println("Acima do Peso");
        } else {
            System.out.println("Obeso");
        }

    }
}
