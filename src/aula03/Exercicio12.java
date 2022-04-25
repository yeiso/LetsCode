package aula03;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "", validaNome;
        int idade = 0, validaIdade;
        int contador = 0;
        double salario = 0, validaSalario;
        String sexo = "", validaSexo;
        String estadoCivil = "", validaEstadoCivil;

        while (contador < 5) {

            while (contador == 0) {
                System.out.println("Digite o Nome:");
                validaNome = scanner.nextLine();
                if (validaNome.length() >= 3) {
                    nome = validaNome;
                    contador++;
                } else {
                    System.out.println("Nome invalido. Digite um nome com pelo menos 3 caracteres.");
                }
            }
            while (contador == 1){
                System.out.println("Digite o Sexo (f ou m):");
                validaSexo = scanner.nextLine();
                if (validaSexo.equalsIgnoreCase("f")  || validaSexo.equalsIgnoreCase("m")){
                    sexo = validaSexo;
                    contador++;
                } else{
                    System.out.println("Sexo Invalido. Digite F ou M");
                }
            }
            while (contador == 2){
                System.out.println("Digite o Estado Civil (s, c, d ou v):");
                validaEstadoCivil = scanner.nextLine();
                if (validaEstadoCivil.equalsIgnoreCase("s") || validaEstadoCivil.equalsIgnoreCase("c") ||
                        validaEstadoCivil.equalsIgnoreCase("d") || validaEstadoCivil.equalsIgnoreCase("v") ){
                    estadoCivil = validaEstadoCivil;
                    contador++;
                } else{
                    System.out.println("Estado civil invalido. Digite um valor entre s, c, d ou v");
                }
            }
            while (contador == 3) {
                System.out.println("Digite a Idade:");
                validaIdade = scanner.nextInt();
                if (validaIdade > 0 && validaIdade < 150) {
                    idade = validaIdade;
                    contador++;
                } else {
                    System.out.println("Idade invalida. Digite uma idade entre 0 e 150.");
                }
            }
            while (contador == 4){
                System.out.println("Digite o Salario:");
                validaSalario = scanner.nextDouble();
                if (validaSalario > 0){
                    salario = validaSalario;
                    contador++;
                } else{
                    System.out.println("Salario invalido. Digite um valor maior que zero.");
                }
            }

        }

        System.out.printf("Formulario enviado com sucesso!%n" +
                "Nome: %s%n" +
                "Idade: %d%n" +
                "Salario: $%.2f%n" +
                "Sexo: %s%n" +
                "Estado Civil: %s%n", nome, idade, salario, sexo, estadoCivil);
    }
}
