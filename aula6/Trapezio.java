package aula6;

public class Trapezio implements FormaGeometrica {
    
    private int baseMaior;

    private int baseMenor;

    private int altura;

    private int ladoA;

    private int ladoB;


    
    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
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

    @Override
    public int getArea() {
        int area;
        area = (baseMaior * baseMenor)*altura/2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = ladoA + ladoB + baseMaior + baseMenor;
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "trapezio";
    }
}
