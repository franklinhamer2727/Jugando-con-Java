package Carpeta5;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(String nombre, int lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        super.area = lado * lado;
        return super.area;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        super.perimetro = lado * 4;
        return super.perimetro;
    }

}
