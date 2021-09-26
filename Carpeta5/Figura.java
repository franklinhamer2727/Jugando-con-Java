package Carpeta5;

public abstract class Figura {
    private String nombre;
    public double area;
    public double perimetro;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

}
