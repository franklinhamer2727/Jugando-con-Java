package Carpeta;

public class Automovil {
    // Atributos

    private String marca;
    private String modelo;
    private int anio;
    private float precio;

    // constructores
    public Automovil() {
        this.modelo = "sin modelo";
        this.marca = "sin marca";
        this.anio = 0;
        this.precio = 0;
    }

    public Automovil(String modelo, String marca, int anio, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;

    }

    // Métodos
    // accesadores
    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return this.modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public float getPrecio() {
        return this.precio;
    }

    // Mutadores
    public void setPrecio(float newPrecio) {
        this.precio = newPrecio;
    }

}