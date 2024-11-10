package clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrarEjercicio {
    public Socio socio;                      
    public Date fecha;                           
    public List<Ejercicio> ejerciciosCumplidos;  

    public RegistrarEjercicio(Socio socio, Date fecha) {
        this.socio = socio;
        this.fecha = fecha;
        this.ejerciciosCumplidos = new ArrayList<>();
    }


    public void registrarEjercicio(Ejercicio ejercicio) {
        ejerciciosCumplidos.add(ejercicio);
        System.out.println("Ejercicio registrado: " + ejercicio.nombre + " para el socio: " + socio.obtenerDetalles() + " en la fecha: " + fecha);
    }

    public void ejerciciosCumplidos() {
        System.out.println("Ejercicios cumplidos por el socio " + socio.nombre + " en la fecha " + fecha + ":");
        for (Ejercicio ejercicio : ejerciciosCumplidos) {
            System.out.println(" - " + ejercicio.obtenerDetalles());
        }
    }
}
