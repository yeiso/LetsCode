package aula07;

import java.util.Scanner;

/**Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
 * Foram obtidos os seguintes dados:
 * Código da cidade;
 * Número de veículos de passeio (em 2021);
 * Número de acidentes de trânsito com vítimas (em 2021). Deseja-se saber:
 * Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
 * Qual a média de veículos nas cinco cidades juntas;
 * Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
 *
 */

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] codigoCidade = new String[5];
        int[] numeroVeiculos = new int[5];
        int[] numeroAcidentes = new int[5];
        int menorIndiceAcidentes = 0;
        int maiorIndiceAcidentes = 0;
        int mediaVeiculosTotal = 0;
        int mediaVeiculosCidadeMenor = 0;
        int qtdeCidadeMenor = 0;

        for (int i = 0; i < codigoCidade.length; i++){
            System.out.printf("Digite o codigo da cidade %d:", i+1);
            codigoCidade[i] = scanner.nextLine();
            System.out.printf("Digite o numero de veiculos de passeio da cidade %s:", codigoCidade[i]);
            numeroVeiculos[i] = scanner.nextInt();
            System.out.printf("Digite o numero de acidentes com vitima da cidade %s:", codigoCidade[i]);
            numeroAcidentes[i] = scanner.nextInt();
            scanner.nextLine();

            mediaVeiculosTotal += numeroVeiculos[i];

            if(numeroAcidentes[i] > numeroAcidentes[maiorIndiceAcidentes]){
                maiorIndiceAcidentes = i;
            } else if (numeroAcidentes[i] < numeroAcidentes[maiorIndiceAcidentes]){
                menorIndiceAcidentes = i;
            }

            if (numeroVeiculos[i] < 2000){
                mediaVeiculosCidadeMenor += numeroVeiculos[i];
                qtdeCidadeMenor++;
            }
        }
        System.out.println("====================================================");
        System.out.println("Relatorio Final:");
        System.out.printf("Maior indice de acidentes: %d - %s %n", numeroAcidentes[maiorIndiceAcidentes], codigoCidade[maiorIndiceAcidentes]);
        System.out.printf("Menor indice de acidentes: %d - %s %n", numeroAcidentes[menorIndiceAcidentes], codigoCidade[menorIndiceAcidentes]);
        System.out.printf("Media total de veiculos nas 5 cidades: %d %n", (mediaVeiculosTotal/5));
        System.out.printf("Media total de veiculos nas %d cidades com menos de 2000 veiculos: %d %n", qtdeCidadeMenor,(mediaVeiculosCidadeMenor/qtdeCidadeMenor));
    }
}
