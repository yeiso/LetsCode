package aula06;

import java.util.Scanner;

/**Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
 * (1) – inserir um contato
 * (2) – Remover um contato
 */

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int LIMITE_CONTATOS = 2;
        String[] telefoneContato = new String[LIMITE_CONTATOS];
        int[] idadeContato = new int[LIMITE_CONTATOS];
        String[] codigoContato = new String[LIMITE_CONTATOS];
        int opcao = -1;
        int contadorContados = 0;

        while (opcao != 0){
            System.out.println("==============================");
            System.out.printf("AGENDA %n1 - Inserir um contato %n2 - Remover um contato %n3 - Listar Contatos %n0 - Sair %n");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) {
                System.out.println("Programa encerrado!");
            } else if (opcao == 1){
                if (contadorContados == LIMITE_CONTATOS){
                    System.out.println("Lista de contatos cheia! Apague um contato.");
                    opcao = -1;
                } else {
                    for (int i = 0; i < LIMITE_CONTATOS;){
                        if (codigoContato[i] != null){
                            i++;
                        } else {
                            System.out.print("Digite o telefone do contado: ");
                            telefoneContato[i] = scanner.nextLine();
                            System.out.print("Digite o codigo do contado: ");
                            codigoContato[i] = scanner.nextLine();
                            System.out.print("Digite a idade do contado: ");
                            idadeContato[i] = scanner.nextInt();
                            contadorContados++;
                            i = LIMITE_CONTATOS;
                        }
                    }
                }
            } else if (opcao == 2){
                System.out.println("SELECIONE UM CONTATO PARA APAGAR");
                for (int i = 0; i < LIMITE_CONTATOS; i++){
                    if (codigoContato[i] != null){
                        System.out.printf("%d - %s - %s - %d anos %n", i,codigoContato[i], telefoneContato[i], idadeContato[i]);
                    }
                }
                int index = scanner.nextInt();
                if (codigoContato[index] == null){
                    System.out.println("Contato não existe");
                } else {
                    codigoContato[index] = null;
                    telefoneContato[index] = null;
                    idadeContato[index] = 0;
                    contadorContados--;
                    System.out.println("Contato apagado com sucesso!");
                }
            } else if (opcao == 3) {
                for (int i = 0; i < LIMITE_CONTATOS; i++){
                    if (codigoContato[i] != null){
                        System.out.printf("%d - %s - %s - %d anos %n", i,codigoContato[i], telefoneContato[i], idadeContato[i]);
                    }
                }
            } else {
                System.out.println("Opcao invalida. Digite novamente.");
            }

        }



    }
}
