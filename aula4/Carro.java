package aula4;

import java.lang.Math;

public class Carro {
    String marca;
    String modelo;
    String tipoCombustivel;

    int numPassageiro;
    double capCombustivel;
    double consCombustivel;

    public double calculaAutonomia() {
        return Math.round((this.capCombustivel * this.consCombustivel));
    }

    public double veririfcarEcoDesempenho() {
        double eco = this.calculaAutonomia() / this.numPassageiro;
        if (this.tipoCombustivel == "gasolina") {
            return Math.round(eco);
        } else if (this.tipoCombustivel == "etanol"){
            return Math.round(eco*0.7);
        } else {
            return Math.round(eco*1.6);
        }
    }

    public boolean validaEcoDesempenho(double indice) {
        if (this.veririfcarEcoDesempenho() > indice) {
            return true;
        } else {
            return false;
        }
    }
}