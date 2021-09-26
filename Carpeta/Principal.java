package Carpeta;

public class Principal {
    public static void main(String[] args) {
        Automovil autoJara, autoFranklin;
        autoJara = new Automovil();
        autoFranklin = new Automovil("A23", "Toyota", 2017, 6565);
        System.out.println("Datos del auto de Jara");
        System.out.println("=====================================");
        System.out.println("Precio: " + autoJara.getPrecio());
        System.out.println("Marca: " + autoJara.getMarca());
        System.out.println("Modelo: " + autoJara.getModel());
        System.out.println("Año: " + autoJara.getAnio());
        System.out.println("=====================================");
        System.out.println("Datos del auto de Franklin");
        System.out.println("=====================================");
        System.out.println("Precio: " + autoFranklin.getPrecio());
        System.out.println("Marca: " + autoFranklin.getMarca());
        System.out.println("Modelo: " + autoFranklin.getModel());
        System.out.println("Año: " + autoFranklin.getAnio());
    }
}