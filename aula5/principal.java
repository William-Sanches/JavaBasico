package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Reginaldo Pereira");
        p1.setEndereço("Rua das Flores, 220");
        p1.setTelefone("(16)98836-4425");
        p1.setCpf("221.256.774-39");
        p1.setNomeCurso("Java Spring Web");
        p1.setSalario(24.20);

        a1.setNome("Murilo Pacheco");
        a1.setEndereço("Rua dos Alfeneiros, 4");
        a1.setTelefone("(21)99756-5623");
        a1.setCurso("Java Spring Web");
        a1.setCpf("506.632.855-19");
        /* double[] notas = {9.5, 6.5, 8.5, 6.3, 9.7}; */
        /* a1.setNotas(notas); */

        a2.setNome("João Gomes");
        a2.setEndereço("Rua dos Caules, 34");
        a2.setTelefone("(21)99756-4230");
        a2.setCurso("Java Spring Web");
        a2.setCpf("534.212.355-12");
        double[] notas = {6.7, 6.5, 6.5, 6.8, 6.7, 6.9};
        a2.setNotas(notas);

        System.out.println(p1.montaHolerite());
        /* System.out.println(a1.montaBoletim()); */
        System.out.println(a2.montaBoletim(true));
    }
}
