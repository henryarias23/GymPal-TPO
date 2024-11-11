package clases;

public class Ejercicio {
    public String nombre;
    public int series;
    public double pesoAsignado;
    public int repeticiones;
    public String videoURL;
    public NivelAerobico nivelAerobico;
    public NivelExigenciaMuscular nivelExigenciaMuscular;

    public Ejercicio(String nombre, int series, double pesoAsignado, int repeticiones, String videoURL, NivelAerobico nivelAerobico, NivelExigenciaMuscular nivelExigenciaMuscular) {
        this.nombre = nombre;
        this.series = series;
        this.pesoAsignado = pesoAsignado;
        this.repeticiones = repeticiones;
        this.videoURL = videoURL;
        this.nivelAerobico = nivelAerobico;
        this.nivelExigenciaMuscular = nivelExigenciaMuscular;
    }

    public String obtenerDetalles() {
        return "Ejercicio: " + nombre + ", Series: " + series + ", Peso asignado: " + pesoAsignado +
               ", Repeticiones: " + repeticiones + ", Nivel aeróbico: " + nivelAerobico +
               ", Exigencia muscular: " + nivelExigenciaMuscular + ", Video: " + videoURL;
    }
}
