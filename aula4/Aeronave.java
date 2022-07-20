package aula4;

import java.lang.Math;

public class Aeronave {

    int tripulação;
    int passageiros;
    double consumo;
    double passagem;
    double tanque;
    String combustivel;

    public double calculaAutonomia() {
        return Math.round((this.tanque * this.consumo));
    }

    public double autonomiaCorrigida() {
        if (this.passageiros / this.tripulação < 0.5) {
            return calculaAutonomia() * 1;
        } else if (this.passageiros/this.tripulação > 0.5 && this.passageiros/this.tripulação < 0.8){
            return calculaAutonomia() * 0.9;
        } else {
            return calculaAutonomia() * 0.8;
        }
    }

    public double validaEco(){
        return autonomiaCorrigida()/passageiros;
    }
}

/*
 * Criar uma classe chamada Aeronave:
 * [tripulacao, combustivel, consumo, passageiros, passagem, tanque]
 * Criar os métodos da classe Aeronave:
 * 1. calcular a autonomia da Aeronave.
 * 2. calcular o indice por passageiro.
 * 3. Media de valor por autonomiia de voo.
 * Depois usar a classe programa para mostrar estes dados em
 * 4 objetos e seu local fisico de armazenamento.
 */