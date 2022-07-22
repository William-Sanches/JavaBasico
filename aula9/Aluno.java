package aula9;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String cpf;
    

    //#region Construtores e Encapsulamento
    public Aluno(String nome, String email, double salario, String cpf) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.cpf = cpf;
    }


    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno [cpf=" + cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }

    //#endregion

    //#region Getters e Setters

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    //#endregion

    //#region

    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        setNome(valorSeparado[0]);
        setEmail(valorSeparado[1]);
        setSalario(Double.parseDouble(valorSeparado[2]));
        setCpf(valorSeparado[3]);
    }

    public void separaCpf(){
        String cpf = getCpf();
        String[] cpfSeparado = cpf.split("-");
        System.out.println(cpfSeparado[0]);
        System.out.println(cpfSeparado[1]);

        String campos = cpfSeparado[0];
        String troca = campos.replace(".", ";");
        System.out.println(troca);
        String[] campoSeparado = troca.split(";");
        int c1 = Integer.parseInt(campoSeparado[0]);
        int c2 = Integer.parseInt(campoSeparado[1]);
        int c3 = Integer.parseInt(campoSeparado[2]);
        int d1 = Integer.parseInt(cpfSeparado[1]);

        System.out.println("Inteiro c1: "+c1+"Inteiro c2: "+c2+"Inteiro c3: "+c3+"Inteiro d1: "+d1);

    }
    //#endregion

}
