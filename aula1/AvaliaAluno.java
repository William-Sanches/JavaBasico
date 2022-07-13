package aula1;

public class AvaliaAluno {
    public static void main(String[] args){
        String aluno = "Lucas Bascos";
        double nota1 = 8.6;
        double nota2 = 5.2;
        double nota3 = 7.2;
        double media = 0;
        double fator1 = 0.6;
        double fator2 = 0.2;
        boolean skl = false;

        /* Se o aluno for estagiário -> soma das notas tem maior fator a n1. caso não, o maior fator será estágio (n3) */
        /* Para o aluno ser aprovado ele precisa somar 7 no total. */

        if (skl == true){
            media = ((nota1 * fator1) + (nota2 * fator2) + (nota3 * fator2));
            System.out.println("O aluno tem estágio. Sua média é " + media);
            if (media >= 7){
                System.out.println("Aluno aprovado com média " + media);
            } else {
                System.out.println("Aluno reprovado com média " + media);
            }
        } else {
            media = ((nota3 * fator1) + (nota2 * fator2) + (nota1 * fator2));
            System.out.println("O aluno não tem estágio. Sua média é " + media);
            if (media >= 7){
                System.out.println("Aluno aprovado com média " + media);
            } else {
                System.out.println("Aluno reprovado com média " + media);
            }
        }
    }
}