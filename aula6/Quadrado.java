package aula6;

public class Quadrado implements FormaGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = lado * 4;
        return perimetro;
    }

    @Override
    public String getNomeFigura(){
        return "quadrado";
    }
}
