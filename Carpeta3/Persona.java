package Carpeta3;

public class Persona {
    private String rut;
    private String nombre;
    private int edad;

    /**
     * Este es el constructor de la clase Persona
     * 
     * @param rut    El rut como string
     * @param nombre Nombre como String
     * @param edad   Edad como int
     */
    public Persona(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Este método se utilizara para rescatar el rut de la persona
     * 
     * @return El rut como String
     */
    public String getRut() {
        return this.rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " y tengo :" + edad + " mi rut " + rut;

    }
}
