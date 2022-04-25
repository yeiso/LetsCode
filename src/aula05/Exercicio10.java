package aula05;

// Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas)
// onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1.
// Na sequência mostra o valor lido e a relação de notas necessárias


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valorNotas[] = {100, 50, 20, 10, 5, 2, 1};
        int valor;
        int quantidadeNotas;

        System.out.println("Digite o valor:");
        valor = scanner.nextInt();

        System.out.println("=======================");
        System.out.printf("VALOR DE $%d,00 %n%n", valor);
        while (valor > 0){
            for(int i =0; i < valorNotas.length; i++){
                if(valor >= valorNotas[i]){
                    quantidadeNotas = valor/valorNotas[i];
                    valor = valor%valorNotas[i];
                    System.out.printf("%d notas de $%d,00. %n", quantidadeNotas, valorNotas[i]);
                }
            }
        }
    }
}
