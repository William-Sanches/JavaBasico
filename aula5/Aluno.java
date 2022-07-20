package aula5;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;
    private boolean estagio = false;

    // #region Encapsulamento (getters e setters)
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean getEstagio(){
        return estagio;
    }

    public void setEstagio(boolean estagio){
        this.estagio=estagio;
    }

    // #endregion

    // #region Regras de Negócio
    private double calculaMedia() {
        double media = 0;
        for (int i = 0; i < this.notas.length; i++) {
            media += notas[i];
        }
        return (media / notas.length);
    }

    private double calculaMedia(double peso) {
        double media = 0;
        if (notas.length > 5 && notas.length < 13) {
            for (int i = 0; i < notas.length; i++) {
                if (i >= 3) {
                    media += (notas[i] * peso);
                } else {
                    media += notas[i];
                }
            }
            return media/notas.length;
        } else {
            return -1;
        }
        
    }

    public String montaBoletim() {
        String boletim = "Nome do Aluno: " + super.getNome() + System.lineSeparator();
        if (this.verificaAprovacao(this.calculaMedia()) == false) {
            boletim += (System.lineSeparator() + "Devido a política da academia, o resultado está disponível on-line");
        } else {
            if (this.notas.length > 3 && this.notas.length < 10) {
                boletim += ("CPF: " + super.getCpf() + System.lineSeparator() + System.lineSeparator());
                for (int i = 0; i < this.notas.length; i++) {
                    boletim += (" avaliação: " + this.notas[i] + " | " + System.lineSeparator());
                }
                boletim += ("Resultado: Aprovado." + System.lineSeparator());
                boletim += ("Media final: " + this.calculaMedia() + System.lineSeparator());
            } else {
                return ("Número inválido de avaliações");
            }
        }
        return boletim;
    }

    public String montaBoletim(boolean estagio) {
        String boletim = "Nome do Aluno: " + super.getNome() + System.lineSeparator();
        if (this.verificaAprovacao(this.calculaMedia()*1.2) == false) {
            boletim += (System.lineSeparator() + "Devido a política da academia, o resultado está disponível on-line");
        } else {
            if (this.notas.length > 3 && this.notas.length < 10) {
                boletim += ("CPF: " + super.getCpf() + System.lineSeparator() + System.lineSeparator());
                for (int i = 0; i < this.notas.length; i++) {
                    boletim += (" avaliação: " + this.notas[i] + " | " + System.lineSeparator());
                }
                boletim += ("Resultado: Aprovado." + System.lineSeparator());
                boletim += ("Media final: " + this.calculaMedia()*1.2 + System.lineSeparator());
            } else {
                return ("Número inválido de avaliações");
            }
        }
        return boletim;
    }

    private boolean verificaAprovacao(double media) {
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }
    // #endregion
}
