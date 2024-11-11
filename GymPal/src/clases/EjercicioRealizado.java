package clases;

import java.util.ArrayList;
import java.util.List;

public class EjercicioRealizado {
    private Entrenamiento entrenamiento;
    private Ejercicio ejercicio;
    private int seriesRealizadas;
    private double levantado;
    private int repeticionesRealizadas;

    public EjercicioRealizado(Entrenamiento entrenamiento, Ejercicio ejercicio, int seriesRealizadas, double levantado, int repeticionesRealizadas) {
        this.entrenamiento = entrenamiento;
        this.ejercicio = ejercicio;
        this.seriesRealizadas = seriesRealizadas;
        this.levantado = levantado;
        this.repeticionesRealizadas = repeticionesRealizadas;
    }

    public void registrarProgreso() {
        System.out.println("Progreso registrado para el ejercicio: " + ejercicio.getNombre());
    }

    public List<EjercicioRealizado> entrenamientoDelDia() {
        List<EjercicioRealizado> ejerciciosDelDia = new ArrayList<>();
        ejerciciosDelDia.add(this);
        return ejerciciosDelDia;
    }

    public List<EjercicioRealizado> ejerciciosRealizados() {
        List<EjercicioRealizado> realizados = new ArrayList<>();
        realizados.add(this);
        return realizados;
    }

    public Entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public int getSeriesRealizadas() {
        return seriesRealizadas;
    }

    public double getLevantado() {
        return levantado;
    }

    public int getRepeticionesRealizadas() {
        return repeticionesRealizadas;
    }
}
