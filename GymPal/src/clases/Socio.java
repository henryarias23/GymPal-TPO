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
    private double altura;
    private Objetivo objetivo;
    private List<Trofeo> trofeos;
    private List<Trofeo> obs;
    public Rutina rutina;
    public ILogger logger;
    private Rutina rutina;
    private ILogin login;
    private SocioDAO socioDAO;

    public Socio(String nombre, int edad, String sexo, double peso, double altura, ILogger logger) {
    public Socio(String nombre, int edad, String sexo, double peso, ILogin login, SocioDAO socioDAO) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.login = login;
        this.socioDAO = socioDAO;
        this.trofeos = new ArrayList<>();
        this.obs = new ArrayList<>();
    }

    public String getSexo() {
        return sexo;
    }
    // Métodos de la clase

    public double getPeso() {
        return peso;
    public void elegirObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
    }

    public double getAltura() {
        return altura;
    }
    public String obtenerDetalles() {
        String detalles = String.format("Nombre: %s, Edad: %d, Sexo: %s, Peso: %.2f kg, Altura: %.2f m, Objetivo: %s", 
                                         nombre, edad, sexo, peso, altura, (objetivo != null ? objetivo.getNombre() : "Sin objetivo"));
        logger.logearEvento("Detalles obtenidos para socio: " + nombre);
        return detalles;
    public void registrarPesaje(double nuevoPeso) {
        this.peso = nuevoPeso;
        System.out.println("Peso actualizado a: " + nuevoPeso + " kg");
    }

    public void elegirObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
        logger.logearEvento("Objetivo cambiado a: " + nuevoObjetivo.getNombre() + " para socio: " + nombre);
    public void login(String user, String pass) {
        if (login != null) {
            login.login(user, pass);
        } else {
            System.out.println("Login no configurado.");
        }
    }

    public void comenzarEntrenamiento() {
        if (rutina != null) {
            rutina.crearRutina();
            logger.logearEvento("Entrenamiento comenzado para el socio: " + nombre);
    public void registrar(SocioDTO socioDTO) {
        if (socioDAO != null) {
            socioDAO.registrar(socioDTO);
            System.out.println("Socio registrado en la base de datos.");
        } else {
            logger.logearEvento("No se puede comenzar el entrenamiento. No hay rutina asignada para socio: " + nombre);
            System.out.println("DAO no configurado para registrar.");
        }
    }

    public void registrarPesaje(double peso) {
        this.peso = peso;
        logger.logearEvento("Pesaje registrado: " + peso + " kg para socio: " + nombre);
    public void cambiarObjetivo(Objetivo nuevoObjetivo) {
        this.objetivo = nuevoObjetivo;
    }

    public void verProgreso() {
    public void iniciarRutina() {
        if (rutina != null) {
            logger.logearEvento("Progreso actual para el socio " + nombre + ": " + rutina.obtenerProgreso());
            rutina.crearRutina();
            System.out.println("Rutina iniciada.");
        } else {
            logger.logearEvento("No se puede ver el progreso. No hay rutina asignada para el socio: " + nombre);
            System.out.println("No hay rutina asignada.");
        }
    }

    public void trofeosObtenidos() {
        StringBuilder trofeosInfo = new StringBuilder("Trofeos obtenidos para socio " + nombre + ": ");
        for (Trofeo trofeo : trofeos) {
            trofeosInfo.append(trofeo.getNombre()).append(", ");
        }
        logger.logearEvento(trofeosInfo.toString());
    }

    public void agregarTrofeo(Trofeo trofeo) {
        trofeos.add(trofeo);
        if (logger != null) {
            logger.logearEvento("Trofeo obtenido: " + trofeo.getNombre());
        }
    public double getPeso() {
        return peso;
    }

    public List<Trofeo> getTrofeos() {
        return new ArrayList<>(trofeos); // Retornamos una copia para evitar modificaciones externas
    public String getSexo() {
        return sexo;
    }
>>>>>>> c44e8b677ec891fb0d9ec87a379ad3ea0c326db1
}

