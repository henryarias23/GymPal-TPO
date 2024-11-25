package controladores;

import java.util.Scanner;

import clases.Socio;
import implementaciones.LoginAdapter;
import interfaces.ILogin;
public class SocioController {

	 private ILogin login;
	 private Scanner scanner;

	    public SocioController(Scanner scanner) {
	        this.login = new LoginAdapter();
	        this.scanner = scanner;
	    }

	    public Socio crearSocio(String nombre, int edad, String sexo, double peso) {
	        System.out.print("Ingresa tu usuario: ");
	        String usuario = scanner.nextLine();  // Leemos el usuario
	        System.out.print("Ingresa tu contraseña: ");
	        String contraseña = scanner.nextLine();  // Leemos la contraseña
	        
	        // Creamos el nuevo Socio con los datos recibidos
	        Socio nuevoSocio = new Socio(nombre, edad, sexo, peso, usuario, contraseña);
	        System.out.println("Socio creado exitosamente: " + nuevoSocio.getNombre());
	        
	        return nuevoSocio;
	    }
	    
	    public void loguearse(Socio socio) {
	        if (socio == null) {
	            System.out.println("\nNo hay ningún socio registrado. Por favor, crea un socio primero.");
	            return;
	        }
	        System.out.println("\nIniciando sesión...");
	        System.out.print("Ingresa tu usuario: ");
	        String inputUsuario = scanner.nextLine();

	        System.out.print("Ingresa tu contraseña: ");
	        String inputContraseña = scanner.nextLine();
	        
	        login.login(inputUsuario, inputContraseña, socio);
	        
	    }
    
   /* //---------------------------------------

    public void registrarPesaje(Socio socio, double peso) {
        socio.registrarPesaje(peso);
        login.logearEvento("Pesaje registrado para socio: " + socio.obtenerDetalles());
    }

    public void agregarTrofeo(Socio socio, Trofeo trofeo) {
        socio.trofeos.add(trofeo);
        login.logearEvento("Trofeo " + trofeo.getNombre() + " agregado al socio: " + socio.obtenerDetalles());
    }

    public String obtenerDetalles(Socio socio) {
        return socio.obtenerDetalles();
    }
    
    */
}


