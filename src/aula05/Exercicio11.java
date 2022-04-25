package aula05;

// Leia um número inteiro que representa um código de DDD para discagem interurbana
// Em seguida, informe à qual cidade o DDD pertence

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String listaCidades[] = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int listaDDD[] = {31, 71, 11, 21, 32, 19, 27, 31};
        int buscaDDD;
        int indexDDD = -1;

        System.out.println("Digite um DDD:");
        buscaDDD = scanner.nextInt();

        for (int i = 0; i < listaDDD.length; i++){
            if(listaDDD[i] == buscaDDD){
                indexDDD = i;
            }
        }

        if(indexDDD > -1){
            System.out.printf("O DDD solicitado (%d) pertence a cidade de %s.", buscaDDD, listaCidades[indexDDD]);
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
