package aula02;

public class Exercicio03 {
    public static void main(String[] args) {
        String alunos[] = {"ALINE", "MARIO", "SERGIO", "SHIRLEY"};
        String notas[] = {"9.0", "DEZ", "4.5", "7.0"};
        System.out.println("ALUNO(A)             NOTA");
        System.out.println("========             ====");

        for(int i = 0; i < alunos.length; i++){
            System.out.format("%s                  %s%n", alunos[i], notas[i]);
        }


    }
}
