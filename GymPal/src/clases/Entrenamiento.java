package clases;

import java.util.ArrayList;
import java.util.List;
//import java.sql.Time;

public class Entrenamiento {
    private String dias;
    private String nombre;
   // private Time tiempo;
    private List<Ejercicio> ejercicios;
    private IgruposMusculares gruposMusculares;

    public Entrenamiento(String nombre, String dias) {
        this.dias = dias;
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
      //this.tiempo = tiempo;
        //this.gruposMusculares = gruposMusculares;
    }

   /* public void entrenamientoDetalle() {
        System.out.println("Entrenamiento asignado en días: " + dias);
        //System.out.println("Duración del entrenamiento: " + tiempo);
        //System.out.println("Grupo muscular principal: " + gruposMusculares);
        System.out.println("Ejercicios en este entrenamiento:");
        
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(" - " + ejercicio.obtenerDetalles());
        }
    }*/
    
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }
    
    public void mostrarEntrenamiento() {
		System.out.println("\nEntrenamiento: " + nombre);
        for (Ejercicio ejercicio : ejercicios) {
            ejercicio.mostrarEjercicio();
        }
    }
    
    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
}

