package aula06;

/*Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:
  O valor total das compras à vista
  O valor total das compras a prazo
  O valor total das compras efetuadas
  O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
 */

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Character[] tipoVendas = new Character[3];
        double[] valorVendas = new double[3];
        double totalVendasAVista = 0;
        double totalVendasAPrazo = 0;

        for(int i = 0; i < tipoVendas.length; i++){
            System.out.printf("Digite o tipo da venda: %n V - a Vista %n P - a Prazo %n");
            tipoVendas[i] = scanner.nextLine().toUpperCase().charAt(0);

            System.out.printf("Digite o valor da venda: %n");
            valorVendas[i] = scanner.nextDouble();
            scanner.nextLine();
            if(tipoVendas[i] == 'V'){
                totalVendasAVista += valorVendas[i];
            } else if (tipoVendas[i] == 'P'){
                totalVendasAPrazo += valorVendas[i];
            }
        }

        System.out.println("============================================");
        System.out.printf("Total de compras a vista: R$ %.2f %n", totalVendasAVista);
        System.out.printf("Total de compras a prazo: R$ %.2f %n", totalVendasAPrazo);
        System.out.printf("Total de compras: R$ %.2f %n", (totalVendasAVista + totalVendasAPrazo));
        System.out.println("============================================");
        System.out.println("Valor das parcelas de compras a prazo:");
        for (int i = 0; i < tipoVendas.length; i++){
            if (tipoVendas[i] == 'P'){
                System.out.printf("Parcela 1 de 3 - Compra ID:%d - R$ %.2f %n", i, (valorVendas[i]/3));
            }
        }
    }
}
