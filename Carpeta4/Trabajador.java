package Carpeta4;

public class Trabajador extends Persona {
    private int sueldo;

    public Trabajador(String dni, String nombre, int sueldo) {
        super(dni, nombre);
        // TODO Auto-generated constructor stub
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int value) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return this.sueldo + " " + super.getNombre() + " " + super.getDni();
    }

}