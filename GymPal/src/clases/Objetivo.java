package clases;

public abstract class Objetivo {
    protected String nombre;
    protected String descripcion;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    // Método abstracto que debe ser implementado por las clases concretas
    public abstract void mostrarDescripcion();
    
    public  abstract void  generarRutina();

    public boolean cumplirObjetivo(Socio socio) {
        System.out.println("Verificando cumplimiento del objetivo para el socio: " + socio.obtenerDetalles());
        return false;
    }

    public void sugerirCambio() {
        System.out.println("Sugerencia de cambio para el objetivo: " + nombre);
    }


}

