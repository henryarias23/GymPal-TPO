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
    
    // Método para obtener la lista de entrenamientos
    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }
    
    // Método para obtener el objetivo de la rutina
    public String getObjetivo() {
        return objetivo;
    }
    
    // Método para mostrar los detalles de la rutina
    public void mostrarRutina() {
       // System.out.println(/*"\nRutina para el objetivo: " +*/ objetivo);
        for (Entrenamiento entrenamiento : entrenamientos) {
            entrenamiento.mostrarEntrenamiento();
        }
    }
    
   /* FALTA ESTO DE ABAJO HACERLO FUNCIONAR, LO DE ARRIBA ESTA ECHO


    public void reforzarRutina(DecorarEjercicio cambiarValores) {
        cambiarValores.aplicarCambios(entrenamientos);
        System.out.println("Rutina reforzada.");
    }

    public void eliminarRutina() {
        entrenamientos.clear();
        System.out.println("Rutina eliminada.");
    }*/

}

