package clases;

import java.util.Random;

public class Ejercicio {
    private String nombre;
    private int series;
    private double pesoAsignado;
    private int repeticiones;
    private int nivelAerobico;
    private NivelExigenciaMuscular nivelExigenciaMuscular;

   
    public Ejercicio(String nombre, int series, int repeticiones, double pesoAsignado) {
        this.nombre = nombre;
        this.series = series;
        this.pesoAsignado = pesoAsignado;
        this.repeticiones = repeticiones;
        this.nivelAerobico = generarNivelAerobico();
        this.nivelExigenciaMuscular = generarNivelExigenciaMuscular();
    }
    
    public String getNombre() { return nombre; }
    
	public int getSeries() { return series; }
	
	public int getRepeticiones() { return repeticiones ; }
	
	public double getPesoAsignado() {return pesoAsignado; }
	
	public int getNivelAerobico() {return nivelAerobico;}
	
	public NivelExigenciaMuscular getNivelExigenciaMuscular() {return nivelExigenciaMuscular; }
	
	public void setRepeticiones(int repeticiones) { this.repeticiones = repeticiones; }
    
	public void setSeries(int serie ) { this.series = serie; }
	
	public void setPesoAsignado(double pesoAsignado) { this.pesoAsignado = pesoAsignado; }
	
	private int generarNivelAerobico() {
		return new Random().nextInt(10) + 1;
	}
	
    private NivelExigenciaMuscular generarNivelExigenciaMuscular() {
        NivelExigenciaMuscular[] niveles = NivelExigenciaMuscular.values();
        return niveles[new Random().nextInt(niveles.length)];
	}

    public void mostrarEjercicio() {
        System.out.println("Ejercicio: " + nombre);
        System.out.println("Series: " + series + " | Repeticiones: " + repeticiones + 
        		" | PesoAsignado: " + pesoAsignado + " | Nivel Aerobico:  " +  nivelAerobico + " | Exigencia Muscular " +   nivelExigenciaMuscular );
    }

}
