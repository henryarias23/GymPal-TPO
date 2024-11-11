package clases;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private Objetivo objetivo;
    private List<Entrenamiento> entrenamientos;
    private int duracion;

    public Rutina(String string) {
        this.objetivo = string;
        this.entrenamientos = new ArrayList<>();
        this.duracion = 4;
    }

    public Rutina crearRutina() {
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
    
    public void mostrarRutina() {
        System.out.println("\nRutina para el objetivo: " + objetivo);
        for (Entrenamiento entrenamiento : entrenamientos) {
            entrenamiento.mostrarEntrenamiento();
        }
    }

}

