package clases;
import clases.Notificador;
import clases.Socio;


public abstract class Trofeo {

    private String nombre;
    private Notificador notificador ;

    public Trofeo(String nombre, Notificador notificador) { 
	
    	this.nombre = nombre;
    	this.notificador = notificador;	
    }
    	
    public abstract boolean  verificarCumplimiento(Socio socio);
    
    public abstract void otorgarTrofeo(Socio socio);
    
    
}
