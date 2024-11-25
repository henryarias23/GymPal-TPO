package controladores;

import clases.Ejercicio;
import clases.EjercicioRealizado;
import clases.Entrenamiento;
import clases.Rutina;

import java.util.List;
import java.util.Scanner;

public class EjercicioController {
    private EjercicioRealizado ejercicioRealizado;

    // Constructor
    public EjercicioController() {
        this.ejercicioRealizado = new EjercicioRealizado();
    }
    
	public void registrarEjercicio(Scanner scanner, Rutina rutina) {
		ejercicioRealizado.registrarProgreso(scanner, rutina);
	}


    // Método para mostrar el historial de ejercicios realizados
    public void mostrarHistorial() {
        ejercicioRealizado.mostrarEjerciciosRealizados();
    }


}

