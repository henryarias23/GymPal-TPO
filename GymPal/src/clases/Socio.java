package clases;

import interfaces.ILogger;
import java.util.ArrayList;
import java.util.List;

public class Socio {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private Objetivo objetivo;
    private List<Trofeo> trofeos;
    private List<Trofeo> obs;
    public Rutina rutina;
    public ILogger logger;

    public Socio(String nombre, int edad, String sexo, double peso, double altura, ILogger logger) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.logger = logger;
        this.trofeos = new ArrayList<>();
        this.obs = new ArrayList<>();
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    public String obtenerDetalles() {
        String detalles = String.format("Nombre: %s, Edad: %d, Sexo: %s, Peso: %.2f kg, Altura: %.2f m, Objetivo: %s", 
                                         nombre, edad, sexo, peso, altura, (objetivo != null ? objetivo.getNombre() : "Sin objetivo"));
        logger.logearEvento("Detalles obtenidos para socio: " + nombre);
        return detalles;
    }

    public void elegirObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
        logger.logearEvento("Objetivo cambiado a: " + nuevoObjetivo.getNombre() + " para socio: " + nombre);
    }

    public void comenzarEntrenamiento() {
        if (rutina != null) {
            rutina.crearRutina();
            logger.logearEvento("Entrenamiento comenzado para el socio: " + nombre);
        } else {
            logger.logearEvento("No se puede comenzar el entrenamiento. No hay rutina asignada para socio: " + nombre);
        }
    }

    public void registrarPesaje(double peso) {
        this.peso = peso;
        logger.logearEvento("Pesaje registrado: " + peso + " kg para socio: " + nombre);
    }

    public void verProgreso() {
        if (rutina != null) {
            logger.logearEvento("Progreso actual para el socio " + nombre + ": " + rutina.obtenerProgreso());
        } else {
            logger.logearEvento("No se puede ver el progreso. No hay rutina asignada para el socio: " + nombre);
        }
    }

    public void trofeosObtenidos() {
        StringBuilder trofeosInfo = new StringBuilder("Trofeos obtenidos para socio " + nombre + ": ");
        for (Trofeo trofeo : trofeos) {
            trofeosInfo.append(trofeo.getNombre()).append(", ");
        }
        logger.logearEvento(trofeosInfo.toString());
    }

    public void agregarTrofeo(Trofeo trofeo) {
        trofeos.add(trofeo);
        if (logger != null) {
            logger.logearEvento("Trofeo obtenido: " + trofeo.getNombre());
        }
    }

    public List<Trofeo> getTrofeos() {
        return new ArrayList<>(trofeos); // Retornamos una copia para evitar modificaciones externas
    }
}
