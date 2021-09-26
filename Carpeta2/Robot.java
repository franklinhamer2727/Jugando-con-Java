package Carpeta2;

public class Robot {
    private String nombre;
    private int vida = 100;

    public Robot() {
        this.nombre = "Robot";
        // this.vida = 100;

    }

    public Robot(String nombre) {
        this.nombre = nombre;
        // this.vida = vida;
    }

    // public String getNombre() {
    // return this.nombre;
    // }

    // public int getVida() {
    // return this.vida;
    // }

    // public void setNombre(String newnombre) {
    // this.nombre = newnombre;
    // }

    // public void getVida(int newvida) {
    // this.vida = newvida;
    // }

    // metodos
    public void cargar() {
        this.vida = this.vida + 10;

    }

    public void golpear() {
        this.vida = this.vida - 10;

    }

    public void reparar() {

        this.vida = 100;
    }

    public void status() {
        String estado = "vivo";
        if (estaVivo()) {
            estado = "vivo";
        } else {
            estado = "Muerto";
        }
        System.out.println(nombre + "-" + estado + "-" + vida + "%");

    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}
