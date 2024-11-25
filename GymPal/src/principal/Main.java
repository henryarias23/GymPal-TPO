package principal;

import clases.Socio;
import clases.TonificarCuerpo;
import controladores.EjercicioController;
import controladores.RutinaController;
import controladores.SocioController;

import java.util.Scanner;

import clases.BajarDePeso;
import clases.Objetivo;
import clases.Rutina;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

//--------------------------------------ELEGIMOS UN OBJETIVO----------------------------------------------------------------------------//

       /*
        Socio socio1 = new Socio("Carlos", 27, "Masculino");
        socio1.elegirObjetivo(scanner);
        socio1.mostrarInformacion();
        socio1.mostrarRutina();      
        */
//--------------------------------------SETEAMOS UN OBJETIVO---------------------------------------------------------------------//
        
        
        /*  
        Socio socio2 = new Socio("Miguel", 27, "Masculino");
        Objetivo TonificarCuerpo = new TonificarCuerpo(); // Creamos un objetivo específico ejm: TonificarCuerpo
        socio2.setObjetivo(TonificarCuerpo); // Seteamos el objetivo a la persona
        socio2.mostrarInformacion();
        socio2.mostrarRutina();
        */
//----------------------------------------CAMBIO DE OBJETIVO -------------------------------------------------------//
       /*
		Socio socio3 = new Socio("Carlos", 28, "Masculino");
        socio3.elegirObjetivo(scanner); // El usuario elige el objetivo inicial
        socio3.mostrarInformacion();
        socio3.cambiarObjetivo(scanner);
        socio3.mostrarInformacion();
       */
         
	
	   SocioController socioController = new SocioController(scanner);
	   RutinaController rutinaController = new RutinaController();
	   EjercicioController ejercicioController = new EjercicioController();
        

        // Crear un nuevo socio
        Socio nuevoSocio = socioController.crearSocio("Juan", 30, "Masculino", 75.5);
        nuevoSocio.mostrarInformacion();
        
        socioController.loguearse(nuevoSocio);
       
        nuevoSocio.elegirObjetivo(scanner);
        nuevoSocio.mostrarInformacion();
        nuevoSocio.mostrarRutina();
        
        rutinaController.reforzarRutina(nuevoSocio.getRutina());
        
        ejercicioController.registrarEjercicio(scanner, nuevoSocio.getRutina());
        
        ejercicioController.mostrarHistorial();
        

 
        

 
	}

}
