package aula02;

import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomesPraias[] = new String[5];
        double distanciaPraias[] = new double[5];
        int qtdePraiasDistancia = 0;
        int indexMaiorDistancia = 0;

        for (int i = 0; i < nomesPraias.length; i++){
            System.out.printf("Digite o nome da %d° praia: %n", i+1);
            nomesPraias[i] = scanner.nextLine();
        }
        System.out.println("------------------");

        for (int i = 0; i < distanciaPraias.length; i++){
            System.out.printf("Digite a distancia da praia: %s %n", nomesPraias[i]);
            distanciaPraias[i] = scanner.nextDouble();
            if ( 10 < distanciaPraias[i] && distanciaPraias[i] < 15){
                qtdePraiasDistancia++;
            }
            if ( distanciaPraias[i] >= distanciaPraias[indexMaiorDistancia]) {
                indexMaiorDistancia = i;
            }
        }

        OptionalDouble distanciaMedia = Arrays.stream(distanciaPraias).average();

        System.out.printf("Praia mais distante fica a: %.2f Km- %s%n", distanciaPraias[indexMaiorDistancia], nomesPraias[indexMaiorDistancia]);
        System.out.printf("Distancia Media: %.2f Km %n", distanciaMedia.getAsDouble());
        System.out.printf("QTDE Praias entre 10Km e 15Km: %d%n", qtdePraiasDistancia);


    }
}
