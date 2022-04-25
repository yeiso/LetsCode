package aula03;

import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random;
        int numeroAleatorio;
        int numeroUsuario;
        int contadorTentativas = 0;

        random = new Random();
        numeroAleatorio = random.nextInt(10) + 1;

        while (contadorTentativas < 3){
            System.out.printf("Tente adivinhar o numero entre 0 e 10: (%d tentativa) %n", contadorTentativas + 1);
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio){
                System.out.println("PARABENS! VOCE ACERTOU!");
                break;
            } else if (numeroUsuario > numeroAleatorio){
                System.out.println("Tente um numero menor.");
                contadorTentativas++;
            } else {
                System.out.println("Tente um numero maior.");
                contadorTentativas++;
            }

        }
    }
}
