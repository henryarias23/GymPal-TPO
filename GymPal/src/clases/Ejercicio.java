package clases;

import java.util.List;

public class Ejercicio {
    private String nombre;
    private int series;
    private double pesoAsignado;
    private int repeticiones;
    private String videoURL;
    private NivelAerobico nivelAerobico;
    private NivelExigenciaMuscular nivelExigenciaMuscular;

   
    public Ejercicio(String nombre, int series, double pesoAsignado, int repeticiones) {
        this.nombre = nombre;
        this.series = series;
        this.pesoAsignado = pesoAsignado;
        this.repeticiones = repeticiones;
       // this.nivelAerobico = nivelAerobico;
        //this.nivelExigenciaMuscular = nivelExigenciaMuscular;
    }
    
    // Métodos para mostrar los detalles del ejercicio
    public void mostrarEjercicio() {
        System.out.println("Ejercicio: " + nombre);
        System.out.println("Series: " + series + " | Repeticiones: " + repeticiones + " | PesoAsignado: " + pesoAsignado);
    }
}
