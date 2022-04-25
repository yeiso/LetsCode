package aula03;

public class Exercicio03 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if (i%10 == 0){
                System.out.println("Multiplo de dez");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
