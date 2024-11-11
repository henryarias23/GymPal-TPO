package principal;

import clases.Socio;
import clases.TonificarCuerpo;
import clases.BajarDePeso;
import clases.Objetivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        // Creamos  una instancia de un socio
       // Socio pers1 = new Socio("Juan", 25, "Masculino");
       Socio pers2 = new Socio("Miguel", 27, "Masculino");
        
        // Elegimos un objetivo de entrenamiento
        //pers1.elegirObjetivo();
        
        // Creamos un objetivo específico ejm: TonificarCuerpo
        Objetivo BajarDePeso = new BajarDePeso();

        // Seteamos el objetivo a la persona
        pers2.setObjetivo(BajarDePeso);

        // Mostramos la información
        System.out.println("\nInformación de la persona:");
      //pers1.mostrarInformacion();
        pers2.mostrarInformacion();

	}

}
