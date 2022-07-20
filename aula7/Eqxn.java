package aula7;

import java.lang.Math;
import java.lang.reflect.Constructor;

public class Eqxn extends Delta {
    double xn;
    double xp;


    //#region metodos de acesso
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
    //#endregion

    public double calculaXn(double delta, double a, double b){
        xn = (-b-Math.sqrt(delta))/2*a;
        return xn;
    }

    

    public double calculaXp(double delta, double a, double b){
        xp = (-b+Math.sqrt(delta))/2*a;
        return xp;
    }
}
