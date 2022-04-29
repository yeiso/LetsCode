package aula07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] carros = new String[5];
        double[] kmPorLitro = new double[5];
        double[] consumoCarro = new double[5];
        int menorConsumo = 0;

        System.out.println("Comparativel de consumo de combustivel");

        for (int i = 0; i < carros.length; i++){
            System.out.printf("Veiculo %d %n", i+1);
            System.out.print("Nome: ");
            carros[i] = scanner.nextLine();
            System.out.print("Km por litro: ");
            kmPorLitro[i] = scanner.nextDouble();
            scanner.nextLine();

            consumoCarro[i] = (1000 / kmPorLitro[i]) * 7.25;

            if (consumoCarro[i] < consumoCarro[menorConsumo]) {
                menorConsumo = i;
            }
        }

        System.out.println("Relatorio Final:");
        for (int i = 0; i < carros.length; i++){
            System.out.printf("%d - %-15s - %-5.1f -%-5.1f litros - R$ %-5.2f %n", i+1, carros[i], kmPorLitro[i] ,(1000 / kmPorLitro[i]), consumoCarro[i]);
        }

        System.out.printf("O menor consumo e do %s", carros[menorConsumo]);
    }
}
