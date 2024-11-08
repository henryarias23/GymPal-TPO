package clases;

public class Socio {
   
    private String nombre;
    private int edad;
    private String sexo;
    private Objetivo objetivo;
    private List<Rutina> rutinas;
    private List<Trofeo> trofeos;
	private double peso;
    
    // Constructor
    public Socio(Long id, String nombre, String email, int edad, double peso, double altura, String sexo, Objetivo objetivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.objetivo = objetivo;
        this.rutinas = new ArrayList<>();
        this.trofeos = new ArrayList<>();
    }

    // Métodos
    public void iniciarRutina() { /* Lógica de iniciar rutina */ }
    public void cambiarObjetivo(Objetivo nuevoObjetivo) { this.objetivo = nuevoObjetivo; }
    public void registrarPeso(double peso) { this.peso = peso; }
}

