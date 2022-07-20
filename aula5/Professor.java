package aula5;

import java.lang.Math;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    // #region
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    // #endregion

    // #region
    private double calculaSalario() {
        return Math.round(((this.salario * 44) * 4.5)*1.17);
    }

    private double calculaIrpf() {
        double irpf;
        if (calculaSalario() <= 1903.98) {
            irpf = 0;
        } else if (calculaSalario() > 1903.98 && calculaSalario() <= 2826.65) {
            irpf = calculaSalario() * 0.075;
        } else if (calculaSalario() > 2826.65 && calculaSalario() <= 3751.05) {
            irpf = calculaSalario() * 0.15;
        } else if (calculaSalario() > 3751.05 && calculaSalario() <= 4664.68) {
            irpf = calculaSalario() * 0.225;
        } else {
            irpf = calculaSalario() * 0.275;
        }
        return irpf;
    }

    private double calculaInss() {
        double inss;
        if (calculaSalario() <= 1045) {
            inss = calculaSalario() * 0.075;
        } else if (calculaSalario() > 1045 && calculaSalario() <= 2098.60) {
            inss = calculaSalario() * 0.09;
        } else if (calculaSalario() > 2098.60 && calculaSalario() <= 3134.40) {
            inss = calculaSalario() * 0.12;
        } else if (calculaSalario() > 3134.40 && calculaSalario() <= 6101.06) {
            inss = calculaSalario() * 0.14;
        } else {
            inss = 713.09;
        }
        return inss;
    }

    private double calculaDescontos() {
        return (calculaSalario() - calculaInss() - calculaIrpf());
    }

    public String montaHolerite() {
        String holerite;
        holerite = ("Nome do Professor: " + super.getNome() + System.lineSeparator());
        holerite += (" | CPF: " + super.getCpf() + System.lineSeparator());
        holerite += (" | Valor Salario: " + this.calculaSalario() + System.lineSeparator());
        holerite += (" | Valor Hora: " + this.getSalario() + System.lineSeparator());
        holerite += (" | Curso Referente: " + this.getNomeCurso() + System.lineSeparator());
        holerite += (" | Valor INSS: " + this.calculaInss() + System.lineSeparator());
        holerite += (" | Valor IRPF: " + this.calculaIrpf() + System.lineSeparator());
        holerite += (" | Valor Final: " + this.calculaDescontos() + System.lineSeparator());

        return holerite;
    }
    // #endregion
}
