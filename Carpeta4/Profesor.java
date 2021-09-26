package Carpeta4;

public class Profesor extends Trabajador {
    private String titulo;

    public Profesor(String dni, String nombre, int sueldo, String titulo) {
        super(dni, nombre, sueldo);
        // TODO Auto-generated constructor stub
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return this.titulo + " " + super.toString();
    }

}