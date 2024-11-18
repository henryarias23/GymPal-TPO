package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioRealizado {
    private static List<EjercicioRealizado> historial = new ArrayList<>();

    private Entrenamiento entrenamiento;
    private Ejercicio ejercicio;
    private int seriesRealizadas;
    private double levantado;
    private int repeticionesRealizadas;

    // Constructor
    public EjercicioRealizado(Entrenamiento entrenamiento, Ejercicio ejercicio, int seriesRealizadas, double levantado, int repeticionesRealizadas) {
        this.entrenamiento = entrenamiento;
        this.ejercicio = ejercicio;
        this.seriesRealizadas = seriesRealizadas;
        this.levantado = levantado;
        this.repeticionesRealizadas = repeticionesRealizadas;
    }

    // Registrar progreso
    public void registrarProgreso() {
        historial.add(this);
        System.out.println("Progreso registrado exitosamente.");
    }

    // Detalles del jercicio
    public void mostrarDetalles() {
        System.out.println("Detalles del Ejercicio Realizado");
        System.out.println("Día del entrenamiento: " + entrenamiento.getDias());
        System.out.println("Nombre del entrenamiento: " + entrenamiento.getNombre());
        System.out.println("Ejercicio: " + ejercicio.getNombre());
        System.out.println("Series realizadas: " + seriesRealizadas);
        System.out.println("Repeticiones realizadas: " + repeticionesRealizadas);
        System.out.println("Peso levantado: " + levantado + " kg");
    }

    // Metodo para historial
    public static List<EjercicioRealizado> ejerciciosRealizados() {
        return new ArrayList<>(historial);
    }

    // Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu");
            System.out.println("1. Registrar un nuevo ejercicio realizado");
            System.out.println("2. Consultar historial de ejercicios realizados");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: // Registrar ejercicio
                    System.out.print("Ingresa el día del entrenamiento: ");
                    String dia = scanner.nextLine();

                    System.out.print("Ingresa el nombre del entrenamiento: ");
                    String nombreEntrenamiento = scanner.nextLine();

                    Entrenamiento entrenamiento = new Entrenamiento(dia, nombreEntrenamiento);

                    System.out.print("Ingresa el nombre del ejercicio: ");
                    String nombreEjercicio = scanner.nextLine();

                    System.out.print("Ingresa el número de series: ");
                    int series = scanner.nextInt();

                    System.out.print("Ingresa el número de repeticiones: ");
                    int repeticiones = scanner.nextInt();

                    System.out.print("Ingresa el peso levantado (kg): ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine();

                    Ejercicio ejercicio = new Ejercicio(nombreEjercicio, series, repeticiones);
                    EjercicioRealizado realizado = new EjercicioRealizado(entrenamiento, ejercicio, series, peso, repeticiones);
                    realizado.registrarProgreso();
                    break;

                case 2: // Consultar historial
                    System.out.println("\nHistorial de Ejercicios Realizados");
                    if (historial.isEmpty()) {
                        System.out.println("No hay ejercicios registrados.");
                    } else {
                        for (EjercicioRealizado realizadoHistorial : ejerciciosRealizados()) {
                            realizadoHistorial.mostrarDetalles();
                        }
                    }
                    break;

                case 3: // Salir
                    System.out.println("Gracias");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
