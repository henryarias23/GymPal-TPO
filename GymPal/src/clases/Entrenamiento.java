package clases;

import java.util.List;
import java.sql.Time;

public class Entrenamiento {
    public String dias;
    public Time tiempo;
    public List<Ejercicio> ejercicios;
    public IgruposMusculares gruposMusculares;

    public Entrenamiento(String dias, Time tiempo, List<Ejercicio> ejercicios, IgruposMusculares gruposMusculares) {
        this.dias = dias;
        this.tiempo = tiempo;
        this.ejercicios = ejercicios;
        this.gruposMusculares = gruposMusculares;
    }

    public void entrenamientoDetalle() {
        System.out.println("Entrenamiento asignado en días: " + dias);
        System.out.println("Duración del entrenamiento: " + tiempo);
        System.out.println("Grupo muscular principal: " + gruposMusculares);
        System.out.println("Ejercicios en este entrenamiento:");
        
        for (Ejercicio ejercicio : ejercicios) {
            System.out.println(" - " + ejercicio.obtenerDetalles());
        }
    }
}

