package aula6;

public class Triangulo implements FormaGeometrica{
    private int base;

    private int altura;

    private int ladoA;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    private int ladoB;
    
    private int ladoC;

    @Override
    public int getArea() {
        int area;
        area = (base * altura)/2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "triângulo";
    }

}
