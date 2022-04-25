package aula02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite o Endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o CEP:");
        String cep = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        System.out.println(nomeCompleto);
        System.out.println(endereco);
        System.out.println(cep + " - " + telefone );
    }
}
