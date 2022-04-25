package aula05;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {

        double[] numerosAleatorios = new double[10];
        Random random = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = random.nextDouble() * 100;
        }

        for (int i = 0; i < numerosAleatorios.length; i++){
            System.out.printf("= %.2f = %n", numerosAleatorios[i]);
        }

    }
}
