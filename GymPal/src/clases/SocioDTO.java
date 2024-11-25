package clases;

public class SocioDTO {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private String objetivoActual;

    // Constructor
    public SocioDTO(String nombre, int edad, String sexo, double peso, String objetivoActual) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.objetivoActual = objetivoActual;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getObjetivoActual() { return objetivoActual; }
    public void setObjetivoActual(String objetivoActual) { this.objetivoActual = objetivoActual; }
}

