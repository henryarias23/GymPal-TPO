package clases;

public class TonificarCuerpo extends Objetivo {
   // private AdacterValorIdeal adacter;
    
    public TonificarCuerpo() {
    	//this.adacter = adacter;
    	super("Tonificar cuerpo", "Este objetivo se centra en mejorar la tonificación muscular con ejercicios de fuerza.");
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Objetivo: " +nombre);
        System.out.println(descripcion);
    }

	@Override
	public Rutina generarRutina() {
        Rutina rutina = new Rutina(getDescripcion());

        Entrenamiento fuerza = new Entrenamiento("Entrenamiento de fuerza", " dias entrenamineto");
        fuerza.agregarEjercicio(new Ejercicio("Flexiones", 15, 4));
        fuerza.agregarEjercicio(new Ejercicio("Sentadillas", 20, 4));
        fuerza.agregarEjercicio(new Ejercicio("Peso muerto", 12, 3));

        rutina.agregarEntrenamiento(fuerza);
        return rutina;
		
	}
    
	/* --------------------------------------------------  HASTA ACA ESTA ECHO-----------------------------------------------------
	 * 
	 * 
    @Override
    public boolean cumplirObjetivo(Socio socio) {
        double nivelMasaMuscular = adacter.nivelMasaMuscular();
        System.out.println("Verificando si el nivel de masa muscular del socio es adecuado: " + nivelMasaMuscular);
        return nivelMasaMuscular >= 75; 
    }


	*/

}