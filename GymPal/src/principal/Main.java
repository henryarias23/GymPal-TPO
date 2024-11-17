package principal;

import clases.Socio;
import clases.TonificarCuerpo;

import java.util.Scanner;

import clases.BajarDePeso;
import clases.Objetivo;
import clases.Rutina;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

//--------------------------------------CREAMOS UN SOCIO----------------------------------------------------------------------------//
        /*
         
         Socio pers1 = new Socio("Carlos", 27, "Masculino");
        pers1.elegirObjetivo(scanner);
        //pers3.setObjetivo(new TonificarCuerpo()); // Crear y setear un objetivo de entrenamiento
        pers1.mostrarInformacion();
        Rutina rutina = pers1.iniciarRutina();  // Generar y mostrar la rutina
        if (rutina != null) {
            rutina.mostrarRutina();
        }
        
        */
//--------------------------------------SETEAMOS UN OBJETIVO---------------------------------------------------------------------//
        
        /*
          
        Socio pers2 = new Socio("Miguel", 27, "Masculino");
        Objetivo BajarDePeso = new BajarDePeso(); // Creamos un objetivo específico ejm: TonificarCuerpo
        pers2.setObjetivo(BajarDePeso); // Seteamos el objetivo a la persona
        pers2.mostrarInformacion();
        
        */
        
//----------------------------------------CAMBIO DE OBJETIVO -------------------------------------------------------//
       /*
		Socio pers4 = new Socio("Carlos", 28, "Masculino");
        pers4.elegirObjetivo(scanner); // El usuario elige el objetivo inicial
        // Generar y mostrar la rutina inicial
        Rutina rutina = pers4.iniciarRutina();
        if (rutina != null) {
            rutina.mostrarRutina();
        }
        // Cambiar el objetivo de entrenamiento
        System.out.println("\n va a cambiar el objetivo");
        	pers4.cambiarObjetivo(scanner); // Llama al método cambiarObjetivo, que reutiliza elegirObjetivo
            rutina = pers4.iniciarRutina();
            if (rutina != null) {
                rutina.mostrarRutina();
            }
        */    
 
	}

}
