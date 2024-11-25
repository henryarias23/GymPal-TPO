package clases;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import implementaciones.LoginAdapter;
import interfaces.ILogin;
import interfaces.SocioDAO;
/*
import interfaces.ILogin;
import interfaces.SocioDAO;
*/

public class Socio {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private String usuario;
    private String contraseña;
    private Objetivo objetivo;
    private List<Trofeo> trofeos;
    private List<Trofeo> obs;
    private Rutina rutina;
    private ILogin login;
    private SocioDAO socioDAO;
    private Objetivo objetivoEntrenamiento;

    public Socio(String nombre, int edad, String sexo, double peso, String usuario, String contraseña) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.objetivo = null;
        this.rutina = null;
        this.login = null;
        this.socioDAO = socioDAO;
        this.trofeos = new ArrayList<>();
        this.obs = new ArrayList<>();
        
    }
    
    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getsexo() {
        return sexo;
    }

    public void setGenero(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }
    
    public String getSexo() {
        return sexo;
    }
    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    
    }
    
    public Objetivo getObjetivo() { return objetivo; }
    
    public Rutina getRutina() { return this.rutina; }
    
    // Método para setear un objetivo manualmente
    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
        
        // Verificar si el objetivo no es null antes de generar la rutina.....
        if (this.objetivo != null) {
            this.objetivo.generarRutina(); // Genera la rutina del nuevo objetivo
            this.rutina = this.objetivo.getRutina(); // Asigna la rutina generada al atributo 'rutina' de Socio
            System.out.println("\nRutina generada para este objetivo ");
        } else {
            System.out.println("No se ha asignado un objetivo válido, no se puede generar rutina.");
        }
    }

    
    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        if (objetivo != null) {
            objetivo.mostrarDescripcion();
        } else {
            System.out.println("sin objetivo de entrenamiento.");
        }
    }

    // Métodos de la clase

    public void elegirObjetivo(Scanner scanner) {
        System.out.println("\nElige un objetivo de entrenamiento:");
        System.out.println("1. Bajar de peso");
        System.out.println("2. Tonificar cuerpo");
        System.out.println("3. Mantener figura");
        System.out.print("Ingresa el número del objetivo: ");

        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                objetivo = new BajarDePeso();
                break;
            case 2:
                objetivo = new TonificarCuerpo();
                break;
            case 3:
                objetivo = new MantenerFigura();
                break;
            default:
                System.out.println("\nOpción inválida. No se ha asignado un objetivo.");
                objetivo = null;
                return; 
        }

        if (objetivo != null) {
            objetivo.generarRutina(); 
            this.rutina = objetivo.getRutina(); // Asigna la rutina generada
            System.out.println("\nRutina generada para este objetivo ");
        } else {
            System.out.println("No se ha podido generar la rutina porque no se ha seleccionado un objetivo válido.");
        }
    }
    
    public void iniciarRutina() {
        if (this.objetivo != null) {
            this.objetivo.generarRutina(); // Genera la rutina internamente
            System.out.println("\nRutina generada para este objetivo ");
        } else {
            System.out.println("No se ha seleccionado un objetivo. No hay rutina para iniciar.");
        }
    }
    
    public void mostrarRutina() {
        if (rutina != null) {
            rutina.mostrarRutina();
        } else {
            System.out.println("No se ha generado ninguna rutina.");
        }
    }
   
    public void cambiarObjetivo(Scanner scanner) {
        System.out.println("\n¿Deseas cambiar tu objetivo de entrenamiento? (1: Sí, 2: No)");
        int opcion = scanner.nextInt();

        if (objetivo != null) {
            if (opcion == 1) {
                System.out.println("\nCambio de objetivo de entrenamiento:");
                elegirObjetivo(scanner); // Reutilizamos el método elegirObjetivo
                if (objetivo != null) { 
                    System.out.println("\nEl objetivo ha sido cambiado a: " + objetivo.getNombre());
                } 
            } else if (opcion == 2) {
                System.out.println("El objetivo no ha sido cambiado.");
            } else {
                System.out.println("Opción inválida. No se realizó ningún cambio.");
            }
        }else {
        	System.out.println("\nNo se puede cambiar de objetivo, porque no a seleccionado uno");
        }
    }

//----------------------------------hasta aca funciona ---------------------------//
   /* 
    public void registrarPesaje(double nuevoPeso) {
        this.peso = nuevoPeso;
        System.out.println("Peso actualizado a: " + nuevoPeso + " kg");
    }


    public void registrar(SocioDTO socioDTO) {
        if (socioDAO != null) {
            socioDAO.registrar(socioDTO);
            System.out.println("Socio registrado en la base de datos.");
        } else {
            System.out.println("DAO no configurado para registrar.");
        }
    }
*/

}

