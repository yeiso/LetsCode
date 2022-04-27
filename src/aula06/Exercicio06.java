package aula06;

import java.util.Scanner;

/**Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e
 * diga se ela pode doar sangue ou não. Use alguns dos operadores lógicos OU (||) e E (&&).
*/
public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        if (idade >= 18 && idade <= 67){
            System.out.println("Voce pode doar sangue!");
        } else {
            System.out.println("Infelizemente voce nao pode doar sangue.");
        }
    }
}
