package clases;

public class TonificarCuerpo extends Objetivo {
   // private AdacterValorIdeal adacter;
    
    public TonificarCuerpo() {
    	//this.adacter = adacter;
    	this.nombre = "Tonificar Cuerpo";
        this.descripcion = "Este objetivo se centra en mejorar la tonificación muscular con ejercicios de fuerza.";
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Objetivo: " +nombre);
        System.out.println(descripcion);
    }

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        double nivelMasaMuscular = adacter.nivelMasaMuscular();
        System.out.println("Verificando si el nivel de masa muscular del socio es adecuado: " + nivelMasaMuscular);
        return nivelMasaMuscular >= 75; 
    }

    @Override
    public void sugerirCambio(Socio socio) {
        double nivelIdeal = 75;
        System.out.println("Sugerencia de cambio: Para alcanzar el objetivo de tonificación, su nivel de masa muscular ideal es " + nivelIdeal + ".");
    }
}