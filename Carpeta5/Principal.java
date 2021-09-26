package Carpeta5;

public class Principal {
    public static void main(String[] args) {
        Circulo c = new Circulo("Circulo", 2);
        Cuadrado cu = new Cuadrado("Cuadrado", 4);
        System.out.println("Area del Circulo : " + c.calcularArea());
        System.out.println("Perimetro del Circulo : " + c.calcularPerimetro());
        System.out.println("*********************************************");
        System.out.println("Perimetro del cuadrado : " + cu.calcularPerimetro());
        System.out.println("Area del cuadrado : " + cu.calcularArea());

    }

}
