package controladores;

import clases.Ejercicio;
import clases.NivelAerobico;
import clases.NivelExigenciaMuscular;

public class EjercicioController {

    public Ejercicio crearEjercicio(String nombre, int series, int repeticiones, double peso, 
                                    NivelAerobico nivelAerobico, NivelExigenciaMuscular nivelExigencia, String videoURL) {
        Ejercicio ejercicio = new Ejercicio(nombre, series, peso, repeticiones, videoURL, nivelAerobico, nivelExigencia);
        System.out.println("Ejercicio creado: " + ejercicio.obtenerDetalles());
        return ejercicio;
    }

    public void registrarProgreso(Ejercicio ejercicio, int seriesRealizadas, int repeticionesRealizadas, double pesoLevantado) {
        ejercicio.series = seriesRealizadas;
        ejercicio.repeticiones = repeticionesRealizadas;
        ejercicio.pesoAsignado = pesoLevantado;
        System.out.println("Progreso registrado para el ejercicio: " + ejercicio.nombre);
    }

    public String obtenerDetalles(Ejercicio ejercicio) {
        String detalles = ejercicio.obtenerDetalles();
        System.out.println("Detalles del ejercicio: " + detalles);
        return detalles;
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        System.out.println("Ejercicio eliminado: " + ejercicio.nombre);
    }
}
