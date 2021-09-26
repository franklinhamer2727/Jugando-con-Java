package Carpeta5;

public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;

    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        super.area = Math.PI * Math.pow(radio, 2);
        return super.area;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stu
        super.perimetro = Math.PI * 2 * radio;
        return super.perimetro;
    }

}
