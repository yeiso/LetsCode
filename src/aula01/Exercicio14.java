package aula01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner raioScan= new Scanner(System.in);
        double raio;

        System.out.println("Digite o raio do circulo:");
        raio = raioScan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.format("Area do circulo: %.3f", area);
    }
}
