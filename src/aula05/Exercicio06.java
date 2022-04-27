package aula05;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] gabarito = new int[13];
        int[] aposta = new int[13];
        int validaAposta;
        int acertos = 0;
        Random random = new Random();

        for(int i = 0; i < gabarito.length; i++ ){
            gabarito[i] = random.nextInt(3)+1;
        }

        for(int i = 0; i < gabarito.length;){
            System.out.println("Digite o numero para aposta: (1, 2 ou 3)");
            validaAposta = scanner.nextInt();
            while (validaAposta < 1 || validaAposta > 3){
                System.out.println("Valor invalido. Digite apenas 1, 2 ou 3");
                System.out.println("Digite o numero para aposta: (1, 2 ou 3)");
                validaAposta = scanner.nextInt();
            }
            aposta[i] = validaAposta;
            i++;
        }

        for(int i = 0; i < gabarito.length; i++ ){
            if(aposta[i] == gabarito[i]){
                acertos++;
            }
        }

        if(acertos == gabarito.length){
            System.out.println("GANHADOR!");
        }

        System.out.println("Total de acertos:" + acertos);


    }
}
