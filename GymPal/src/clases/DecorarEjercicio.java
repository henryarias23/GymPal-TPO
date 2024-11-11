package clases;

public class DecorarEjercicio {
    protected Ejercicio ejercicio;

    public DecorarEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public void cambiarValores() {
        System.out.println("Aplicando cambios al ejercicio: " + ejercicio.nombre);
    }
}
