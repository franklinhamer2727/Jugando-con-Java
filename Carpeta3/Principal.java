package Carpeta3;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("12-431", "Franklin", 27);
        System.out.println("Nombre :" + p1.getNombre() + " Rut: " + p1.getRut() + " Edad : " + p1.getEdad() + "");
        System.out.println("***************************************");
        System.out.println(p1.toString());

    }
}
