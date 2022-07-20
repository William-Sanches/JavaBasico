package aula7;

public class Delta extends Equacao {
    private double delta;

    // #region metodos de acesso
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    // #endregion

    public double calculaDelta(double a, double b, double c) {
        delta = (b * b) - 4 * a * c;
        return delta;
    }

}
