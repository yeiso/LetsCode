package aula05;

// Faça um programa para receber um conjunto de 10 valores até 100, e insira em uma matriz,
// em seguida você deverá receber um outro valor e verificar se o elemento existe no conjunto de 10 valores da matriz.
// Caso exista você deve imprimir uma mensagem: "O valor existe no conjunto", caso contrário deverá exibir: "--

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrayValores[] = new int[10];
        int valorBusca;
        int existeValor = 0;

        for(int i = 0; i < arrayValores.length; i++){
            System.out.printf("Digite o %d valor do conjunto: %n", i+1);
            arrayValores[i] = scanner.nextInt();
        }

        System.out.println("Digite o valor para buscar no conjunto: ");
        valorBusca = scanner.nextInt();

        for(int i = 0; i < arrayValores.length; i++){
            if (valorBusca == arrayValores[i])
                existeValor++;
        }

        if (existeValor > 0){
            System.out.println("O valor existe no conjunto");
        } else {
            System.out.println("--");
        }

    }
}
