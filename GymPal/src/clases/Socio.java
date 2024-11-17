package clases;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.ILogin;
import interfaces.SocioDAO;

public class Socio {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private Objetivo objetivo;
    private List<Trofeo> trofeos;
    private List<Trofeo> obs;
    private Rutina rutina;
    private ILogin login;
    private SocioDAO socioDAO;
    private Objetivo objetivoEntrenamiento;

    public Socio(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.objetivo = null;
        this.login = login;
        this.socioDAO = socioDAO;
        this.trofeos = new ArrayList<>();
        this.obs = new ArrayList<>();
        this.objetivoEntrenamiento = null;
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

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        if (objetivo != null) {
            objetivo.mostrarDescripcion();
        } else {
            System.out.println("No se ha asignado un objetivo de entrenamiento.");
        }
    }
    
    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    // Métodos de la clase

    public void elegirObjetivo(Scanner scanner) {
        /*try (Scanner scanner = new Scanner(System.in))*/ {
			System.out.println("Elige un objetivo de entrenamiento:");
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
			        System.out.println("Opción inválida. No se ha asignado un objetivo.");
			        objetivo = null;
			}
		}
    }
    
 // Método para setear un objetivo manualmente
    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }
    
    public Rutina iniciarRutina() {
        if (this.objetivo != null) {
            return this.objetivo.generarRutina();
        } else {
            System.out.println("No se ha seleccionado un objetivo de entrenamiento.");
            return null;
        }
    }

    public void cambiarObjetivo( Scanner scanner) {
        System.out.println("Cambio de objetivo de entrenamiento:");
        elegirObjetivo(scanner); // Reutilizamos el método elegirObjetivo
        System.out.println("El objetivo ha sido cambiado a: " + objetivo.getDescripcion());
    }
//----------------------------------hasta aca funciona ---------------------------//
    
    public void registrarPesaje(double nuevoPeso) {
        this.peso = nuevoPeso;
        System.out.println("Peso actualizado a: " + nuevoPeso + " kg");
    }

    public void login(String user, String pass) {
        if (login != null) {
            login.login(user, pass);
        } else {
            System.out.println("Login no configurado.");
        }
    }

    public void registrar(SocioDTO socioDTO) {
        if (socioDAO != null) {
            socioDAO.registrar(socioDTO);
            System.out.println("Socio registrado en la base de datos.");
        } else {
            System.out.println("DAO no configurado para registrar.");
        }
    }


}

