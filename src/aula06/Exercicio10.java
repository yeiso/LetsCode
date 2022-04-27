package aula06;

import java.util.Scanner;

/**Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme:
 * 3 - ótimo,
 * 2 - bom,
 * 1 - regular
 * Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
 * A média das idades das pessoas que responderam ótimo
 * A quantidade de pessoas que respondeu regular;
 * A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.
 */

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contadorOtimo = 0;
        int contadorRegular = 0;
        double contadorBom = 0;
        int idade;
        int mediaIdade = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite sua idade:");
            idade = scanner.nextInt();

            System.out.printf("Sobre o filme, digite a sua opiniao: %n 3 - Otimo %n 2 - Bom %n 1 - Regular %n");
            int notaFilme = scanner.nextInt();

            switch (notaFilme) {
                case 1 -> contadorRegular++;
                case 2 -> contadorBom++;
                case 3 -> {
                    contadorOtimo++;
                    mediaIdade += idade;
                }
            }
        }

        System.out.println("--------------------------");
        System.out.printf("Media de idade das %d pessoas que acharam o filme Otimo: %d %n", contadorOtimo, (mediaIdade / contadorOtimo));
        System.out.printf("%d pessoas acharam o filme Regular %n", contadorRegular);
        System.out.println(((contadorBom/5)*100) + "% das pessoas acharam o filme Bom");
    }
}
