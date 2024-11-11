package clases;

public class Rutina {
    public Socio socio;
    public Objetivo objetivo;
    public Entrenamiento entrenamiento;
    public int duracion = 4;

    public Rutina(Socio socio, Objetivo objetivo, Entrenamiento entrenamiento) {
        this.socio = socio;
        this.objetivo = objetivo;
        this.entrenamiento = entrenamiento;
    }

    public void crearRutina() {
        System.out.println("Rutina creada para el socio: " + socio.obtenerDetalles() +
                           " con el objetivo: " + objetivo.getNombre() +
                           ", duración de: " + duracion + " semanas" +
                           " y entrenamiento asignado: " + entrenamiento.getDetalleEntrenamiento());
    }

    public void reforzarRutina(DecorarEjercicio decorador) {
        for (Ejercicio ejercicio : entrenamiento.ejercicios) {
            decorador.ejercicio = ejercicio;
            decorador.cambiarValores();
        }
        System.out.println("Rutina reforzada aplicando cambios a los ejercicios.");
    }

    public String obtenerProgreso() {
        return "Progreso de la rutina: en curso.";
    }
}

