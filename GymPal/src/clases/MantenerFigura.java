package clases;

public class MantenerFigura extends Objetivo {
    private double pesoOsilante;

    public MantenerFigura() {
    	super("Mantener figura", "Este objetivo busca mantener el estado físico actual mediante ejercicio moderado.");
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("objetivo: "+nombre);
        System.out.println(descripcion);
    }
    
    @Override
    public Rutina generarRutina() {
        Rutina rutina = new Rutina(getDescripcion());

        Entrenamiento mixto = new Entrenamiento("Entrenamiento mixto", " dias entrenamineto");
        mixto.agregarEjercicio(new Ejercicio("Ciclismo", 30, 2));
        mixto.agregarEjercicio(new Ejercicio("Plancha", 60, 3));
        mixto.agregarEjercicio(new Ejercicio("Abdominales", 20, 3));

        rutina.agregarEntrenamiento(mixto);
        return rutina;
    }
/*
 
  ----------------------------------- HASTA ACA ESTA ECHO----------------------------------------------------------------
    @Override
    public boolean cumplirObjetivo(Socio socio) {
        System.out.println("Verificando si el peso del socio está dentro del rango de mantenimiento.");
        double pesoActual = socio.getPeso();
        double rangoPermitido = 5.0;
        return pesoActual >= (pesoOsilante - rangoPermitido) && pesoActual <= (pesoOsilante + rangoPermitido);
    }

    
   */
}