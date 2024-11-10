package clases;

public class CambiarValor extends DecorarEjercicio {
    private int nuevaSerie;
    private int nuevaRepeticion;
    private double nuevoPeso;

    public CambiarValor(Ejercicio ejercicio, int nuevaSerie, int nuevaRepeticion, double nuevoPeso) {
        super(ejercicio);
        this.nuevaSerie = nuevaSerie;
        this.nuevaRepeticion = nuevaRepeticion;
        this.nuevoPeso = nuevoPeso;
    }

    @Override
    public void cambiarValores() {
        ejercicio.series = nuevaSerie;
        ejercicio.repeticiones = nuevaRepeticion;
        ejercicio.pesoAsignado = nuevoPeso;
        System.out.println("Valores del ejercicio actualizados:");
        System.out.println("Series: " + nuevaSerie + ", Repeticiones: " + nuevaRepeticion + ", Peso asignado: " + nuevoPeso);
    }
}
