package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioRealizado {
    private List<Ejercicio> ejercicios;

    public EjercicioRealizado() {
        this.ejercicios = new ArrayList<>();
    }

    
    public void registrarProgreso(Scanner scanner, Rutina rutina) {
    	
    	System.out.println("\nVamos a registrar su Progreso");
        // Obtener los entrenamientos de la rutina
        List<Entrenamiento> entrenamientos = rutina.getEntrenamientos();
        
        if (entrenamientos == null || entrenamientos.isEmpty()) {
            System.out.println("?nNo hay entrenamientos disponibles en esta rutina.");
            return;
        }

        // Mostrar entrenamientos disponibles
        System.out.println("\nEntrenamientos disponibles en la rutina:");
        for (int i = 0; i < entrenamientos.size(); i++) {
            System.out.println((i + 1) + ". " + entrenamientos.get(i).getNombre());
        }

        System.out.print("\nSelecciona el número del entrenamiento: ");
        int entrenamientoSeleccionado = scanner.nextInt();
        scanner.nextLine();

        // Verificar que el entrenamiento seleccionado esté dentro del rango
        if (entrenamientoSeleccionado < 1 || entrenamientoSeleccionado > entrenamientos.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Entrenamiento entrenamiento = entrenamientos.get(entrenamientoSeleccionado - 1);

        // Mostrar ejercicios dentro del entrenamiento seleccionado
        System.out.println("\nEjercicios disponibles en el entrenamiento '" + entrenamiento.getNombre() + "':");
        for (int i = 0; i < entrenamiento.getEjercicios().size(); i++) {
            System.out.println((i + 1) + ". " + entrenamiento.getEjercicios().get(i).getNombre());
        }

        System.out.print("\nSelecciona el número del ejercicio: ");
        int ejercicioSeleccionado = scanner.nextInt();
        scanner.nextLine();

        // Verificar que el ejercicio seleccionado esté dentro del rango
        if (ejercicioSeleccionado < 1 || ejercicioSeleccionado > entrenamiento.getEjercicios().size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Ejercicio ejercicio = entrenamiento.getEjercicios().get(ejercicioSeleccionado - 1);

        // Solicitar datos del progreso
        System.out.print("Ingresa el número de series realizadas: ");
        int series = scanner.nextInt();

        System.out.print("Ingresa el número de repeticiones realizadas: ");
        int repeticiones = scanner.nextInt();

        System.out.print("Ingresa el peso levantado (kg): ");
        double peso = scanner.nextDouble();

        // Registrar el ejercicio realizado
        Ejercicio ejercicioRealizado = new Ejercicio(
            ejercicio.getNombre(),
            series,
            repeticiones,
            peso
        );

        // Guardar en la lista de ejercicios realizados (puedes tener un historial de ejercicios realizados)
        this.ejercicios.add(ejercicioRealizado);
        System.out.println("Progreso registrado exitosamente para el ejercicio: " + ejercicioRealizado.getNombre());
    }

    
    
    
    
    

    
    public void mostrarEjerciciosRealizados() {
        if (ejercicios.isEmpty()) {
            System.out.println("\nNo hay ejercicios realizados registrados.");
            return;
        }

        System.out.println("\nLista de Ejercicios Realizados:");
        for (int i = 0; i < ejercicios.size(); i++) {
            Ejercicio ejercicio = ejercicios.get(i);
            System.out.println((i + 1) + ". " + ejercicio.getNombre());
            System.out.println("   Series: " + ejercicio.getSeries());
            System.out.println("   Repeticiones: " + ejercicio.getRepeticiones());
            System.out.println("   Peso asignado: " + ejercicio.getPesoAsignado() + " kg");
            System.out.println("-------------------");
        }
    }
}















/*package clases;

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
}
    
    
    
/*
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

                    Ejercicio ejercicio = new Ejercicio(nombreEjercicio, series, repeticiones, peso);
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
}*/
