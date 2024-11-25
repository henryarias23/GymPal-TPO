package clases;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private String objetivo;;
    private List<Entrenamiento> entrenamientos;
    private int duracion;

    public Rutina(String objetivo) {
        this.objetivo = objetivo;
        this.entrenamientos = new ArrayList<>();
        this.duracion = 4;
    }

    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.add(entrenamiento);
        //System.out.println("Entrenamiento agregado a la rutina.");
    }
    
    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }
    
    public String getObjetivo() {
        return objetivo;
    }
    
    public void mostrarRutina() {
        for (Entrenamiento entrenamiento : entrenamientos) {
            entrenamiento.mostrarEntrenamiento();
        }
    }


}

