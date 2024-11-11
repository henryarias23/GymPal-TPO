package clases;

public class BajarDePeso extends Objetivo {

    public BajarDePeso() {
    	this.descripcion = "Este objetivo se centra en reducir el peso corporal mediante ejercicio.";
    	this.nombre = " Bajar de peso";
    }
    
	@Override
	public void mostrarDescripcion() {
        System.out.println("Objetivo: "+nombre);
        System.out.println(descripcion);
	}

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

    @Override
    public void sugerirCambio(Socio socio) {
        double pesoIdeal = calcularPesoIdeal(socio);
        System.out.println("Sugerencia de cambio: Para alcanzar el objetivo de bajar peso, su peso ideal es " + pesoIdeal + " kg.");
    }
	
    
}
