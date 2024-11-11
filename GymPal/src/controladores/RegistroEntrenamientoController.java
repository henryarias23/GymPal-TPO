package controladores;

import clases.RegistrarEjercicio;
import clases.Socio;
import clases.Ejercicio;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RegistroEntrenamientoController {
    private Map<Socio, RegistrarEjercicio> registros;  

    public RegistroEntrenamientoController() {
        registros = new HashMap<>();
    }

    public void crearRegistroEntrenamiento(Socio socio) {
        Date fecha = new Date();
        RegistrarEjercicio registro = new RegistrarEjercicio(socio, fecha);
        registros.put(socio, registro);
        System.out.println("Registro de entrenamiento creado para el socio: " + socio.obtenerDetalles() + " en la fecha: " + fecha);
    }

    public void registrarEjercicio(RegistrarEjercicio registro, Ejercicio ejercicio) {
        registro.registrarEjercicio(ejercicio);
        System.out.println("Ejercicio registrado para el socio: " + registro.socio.obtenerDetalles());
    }

    public String obtenerResumen(RegistrarEjercicio registro) {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Resumen de ejercicios cumplidos para el socio ").append(registro.socio.obtenerDetalles())
               .append(" en la fecha ").append(registro.fecha).append(":\n");
        for (Ejercicio ejercicio : registro.ejerciciosCumplidos) {
            resumen.append(" - ").append(ejercicio.obtenerDetalles()).append("\n");
        }
        return resumen.toString();
    }

    public void eliminarRegistro(RegistrarEjercicio registro) {
        registros.remove(registro.socio);
        System.out.println("Registro de entrenamiento eliminado para el socio: " + registro.socio.obtenerDetalles());
    }
}
