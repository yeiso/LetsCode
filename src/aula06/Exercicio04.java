package aula06;

import java.util.Scanner;

/**Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela e calcule
 * a multa que uma pessoa vai receber, sabendo que são pagos:
 *  a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade máxima: 50km/h; motorista a 60km/h ou a 56km/h);
 *  b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
 *  c) 200 reais, se estiver acima de 31km/h da velocidade permitida.
*/
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int velocidadeLimite, velocidadeCarro;

        System.out.println("Digite a velocidade maxima da Avenida:");
        velocidadeLimite = scanner.nextInt();

        System.out.println("Digite a velocidade maxima da Avenida:");
        velocidadeCarro = scanner.nextInt();

        int velocidadeExcedida = (velocidadeCarro - velocidadeLimite);

        if(velocidadeExcedida > 0){
            if (velocidadeExcedida <= 10){
                System.out.println("Multa de R$50,00");
            } else if (velocidadeExcedida <= 30){
                System.out.println("Multa de R$100,00");
            } else{
                System.out.println("Multa de R$200,00");
            }
        } else {
            System.out.println("Sem multa");
        }
    }

}
