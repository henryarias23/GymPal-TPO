package clases;

public class BajarDePeso extends Objetivo {

    public BajarDePeso() {
    	super("Bajar de peso", "Este objetivo se centra en reducir el peso corporal mediante ejercicio.");	
    }
    
	@Override
	public void mostrarDescripcion() {
        System.out.println("Objetivo: "+nombre);
        System.out.println(descripcion);
	}
	
	@Override
	public void generarRutina() {
		this.rutina = new Rutina(getDescripcion());

        Entrenamiento cardio = new Entrenamiento("Cardio intenso", " dias entrenamineto");
        cardio.agregarEjercicio(new Ejercicio("Correr en cinta", 20, 3, 2));
        cardio.agregarEjercicio(new Ejercicio("Burpees", 15, 4, 3));
        cardio.agregarEjercicio(new Ejercicio("Jumping Jacks", 30, 3, 2.5));

        rutina.agregarEntrenamiento(cardio);
        
		
	}
	
	/* ---------------------HASTA ACA ESTA ECHO----------------------------------------------------------------------

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        double pesoIdeal = calcularPesoIdeal(socio);
        System.out.println("Verificando si el socio ha alcanzado el peso ideal de " + pesoIdeal);
        return socio.getPeso() <= pesoIdeal;
    }

    private double calcularPesoIdeal(Socio socio) {
        double alturaEnCm = socio.getAltura() * 100; // Convertimos la altura a centímetros
        if (socio.getSexo().equalsIgnoreCase("Hombre")) {
            // Hombres
            return 50 + 2.3 * ((alturaEnCm - 152) / 2.54);
        } else {
            // Mujeres
            return 45.5 + 2.3 * ((alturaEnCm - 152) / 2.54);
        }
    }
    
    */

	
    
}
