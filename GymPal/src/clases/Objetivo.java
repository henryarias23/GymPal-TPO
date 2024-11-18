package clases;

public abstract class Objetivo {
    protected String nombre;
    protected String descripcion;
	protected Rutina rutina; 
    
    public Objetivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public Rutina getRutina() {
        return rutina;
    }
    
    // Método abstracto
    public abstract void generarRutina();
    public abstract void mostrarDescripcion();
    
    //--------------------------------- HASTA ACA ESTA--------------------------------------------//

   /*  ESTO ME FALTA TODAVIA 
    * 
    * 
    * public boolean cumplirObjetivo(Socio socio) {
        System.out.println("Verificando cumplimiento del objetivo para el socio: " + socio.obtenerDetalles());
        return false;
    }*/

}

