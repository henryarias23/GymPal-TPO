package controladores;

import clases.Entrenamiento;
import clases.Ejercicio;
import clases.DecorarEjercicio;
import clases.Rutina;

public class RutinaController {

    // Método para reforzar todos los ejercicios de la rutina
    public void reforzarRutina(Rutina rutina) {
        if (rutina == null ) {
            System.out.println("\nNo hay rutina creada ");
            return;
        }

        System.out.println("\nReforzando rutina...\n");
        for (Entrenamiento entrenamiento : rutina.getEntrenamientos()) {
            if (entrenamiento.getEjercicios().isEmpty()) {
                System.out.println("El entrenamiento " + entrenamiento.getNombre() + " no tiene ejercicios.");
                continue;
            }

            for (Ejercicio ejercicio : entrenamiento.getEjercicios()) {
                DecorarEjercicio ejercicioDecorado = new DecorarEjercicio(ejercicio);
                ejercicioDecorado.reforzar();
            }
        }
        System.out.println("\nRutina reforzada exitosamente.");
    }

    
    public void eliminarRutina(Rutina rutina) {
        rutina = null;
        System.out.println("Rutina eliminada " );
    }

}
