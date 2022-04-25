package aula01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner cavalosScan= new Scanner(System.in);
        int cavalos;

        System.out.println("Digite o total de cavalos:");
        cavalos = cavalosScan.nextInt();

        int ferraduras = cavalos * 4;

        System.out.println("Para "+ cavalos + " cavalos sao necessarias " + ferraduras + " ferraduras.");
    }
}
