package clases;

public class Objetivo {
    protected String nombre;
    protected String descripcion;

    public Objetivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public boolean cumplirObjetivo(Socio socio) {
        System.out.println("Verificando cumplimiento del objetivo para el socio: " + socio.obtenerDetalles());
        return false;
    }

    public void sugerirCambio() {
        System.out.println("Sugerencia de cambio para el objetivo: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

