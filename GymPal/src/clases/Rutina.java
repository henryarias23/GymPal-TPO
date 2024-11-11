package clases;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private Objetivo objetivo;
    private List<Entrenamiento> entrenamientos;
    private int duracion = 4;

    public Rutina(Objetivo objetivo) {
        this.objetivo = objetivo;
        this.entrenamientos = new ArrayList<>();
    }

    ppublic Rutina crearRutina() {
        System.out.println("Rutina creada para el objetivo: " + objetivo);
        return this;
    }

    public void reforzarRutina(DecorarEjercicio cambiarValores) {
        cambiarValores.aplicarCambios(entrenamientos);
        System.out.println("Rutina reforzada.");
    }

    public void eliminarRutina() {
        entrenamientos.clear();
        System.out.println("Rutina eliminada.");
    }

    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.add(entrenamiento);
        System.out.println("Entrenamiento agregado a la rutina.");
    }

}

