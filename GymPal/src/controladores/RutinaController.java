package controladores;

import clases.Rutina;
import clases.Socio;
import clases.DecorarEjercicio;

public class RutinaController {

    public void generarRutina(Socio socio) {
        if (socio.objetivo != null && socio.rutina != null) {
            socio.rutina.crearRutina();
            System.out.println("Rutina generada para el socio: " + socio.obtenerDetalles());
        } else {
            System.out.println("No se puede generar la rutina. Verifique que el socio tenga un objetivo y una rutina asignada.");
        }
    }

    public void reforzarRutina(Rutina rutina, DecorarEjercicio cambiarValores) {
        rutina.reforzarRutina(cambiarValores);
        System.out.println("Rutina reforzada con cambios en los ejercicios.");
    }

    public String obtenerDetallesRutina(Rutina rutina) {
        String detalles = "Detalles de la rutina para el socio: " + rutina.socio.obtenerDetalles() +
                          "\nObjetivo: " + rutina.objetivo.getNombre() +
                          "\nDuración: " + rutina.duracion + " semanas";
        System.out.println(detalles);
        return detalles;
    }

    public void eliminarRutina(Rutina rutina) {
        rutina.socio.rutina = null;
        System.out.println("Rutina eliminada para el socio: " + rutina.socio.obtenerDetalles());
    }
}
