package clases;

public class DecorarEjercicio extends Ejercicio {
    private Ejercicio ejercicioBase;

    public DecorarEjercicio(Ejercicio ejercicioBase) {
        super(ejercicioBase.getNombre(), ejercicioBase.getSeries(), ejercicioBase.getRepeticiones(), ejercicioBase.getPesoAsignado());
        this.ejercicioBase = ejercicioBase;
    }
    
    public void reforzar() {
        int nuevasRepeticiones = (int) (ejercicioBase.getRepeticiones() * 4);
        ejercicioBase.setRepeticiones(nuevasRepeticiones);
        ejercicioBase.setSeries(ejercicioBase.getSeries() + 2);
        double nuevoPeso = ejercicioBase.getPesoAsignado() * 3;
        ejercicioBase.setPesoAsignado(nuevoPeso);

        System.out.println("Ejercicio reforzado: " + ejercicioBase.getNombre());
        System.out.println( "Nuevas series: " + ejercicioBase.getSeries() + " | Nuevas repeticiones: " + nuevasRepeticiones + 
        		" Nuevo peso: " + nuevoPeso + "| Nivel Aerobico:  " + ejercicioBase.getNivelAerobico() + " | Exigencia Muscular " +  ejercicioBase.getNivelExigenciaMuscular());
    }
    @Override
    public int getRepeticiones() {
        return ejercicioBase.getRepeticiones();
    }

    @Override
    public int getSeries() {
        return ejercicioBase.getSeries();
    }

    @Override
    public double getPesoAsignado() {
        return ejercicioBase.getPesoAsignado();
    }
}
