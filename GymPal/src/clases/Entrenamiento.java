package clases;

import java.util.ArrayList;
import java.util.List;
//import java.sql.Time;

public class Entrenamiento {
    private String dias;
    private String nombre;
   // private Time tiempo;
    private List<Ejercicio> ejercicios;

    public Entrenamiento(String nombre, String dias) {
        this.dias = dias;
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
      //this.tiempo = tiempo;  
    }

// Get del dia
    public String getDias() {
        return dias;
    }

// Get del nombre
    public String getNombre() {
        return nombre;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }
    
    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
    
   /*  NO TOCAR !!!! TENGO QUE MODIFICAR ESTO Y UNIFICARLO CON EL METODO -- > mostrarEntrenamiento() QUE ESTA ABAJO
    * 
    * public void entrenamientoDetalle() {
        System.out.println("Entrenamiento asignado en días: " + dias);
        //System.out.println("Duración del entrenamiento: " + tiempo);
        //System.out.println("Grupo muscular principal: " + gruposMusculares);
        System.out.println("Ejercicios en este entrenamiento:");
        
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(" - " + ejercicio.obtenerDetalles());
        }
    }*/
    
    public void mostrarEntrenamiento() {
		System.out.println("\nEntrenamiento: " + nombre);
        for (Ejercicio ejercicio : ejercicios) {
            ejercicio.mostrarEjercicio();
        }
    }
    
   // ---------------------------aca todo lo que esta funciona

}

