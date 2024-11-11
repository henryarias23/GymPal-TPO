package clases;
<<<<<<< HEAD
import interfaces.ILogger;
import java.util.ArrayList;
import java.util.List;
=======

import interfaces.ILogin;
import interfaces.SocioDAO;
>>>>>>> f8769c1419f66135154a19c6a9225e023fe6bae6

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

    public Socio(String nombre, int edad, String sexo, double peso, ILogin login, SocioDAO socioDAO) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.login = login;
        this.socioDAO = socioDAO;
        this.trofeos = new ArrayList<>();
        this.obs = new ArrayList<>();
    }

    // Métodos de la clase

    public void elegirObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
    }

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

    public void cambiarObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
    }

    public void iniciarRutina() {
        if (rutina != null) {
            rutina.crearRutina();
            System.out.println("Rutina iniciada.");
        } else {
            System.out.println("No hay rutina asignada.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }
>>>>>>> c44e8b677ec891fb0d9ec87a379ad3ea0c326db1
}

