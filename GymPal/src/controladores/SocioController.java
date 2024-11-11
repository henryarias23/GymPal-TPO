public class SocioController {
    private ILogger logger;

    public SocioController(ILogger logger) {
        this.logger = logger;
    }

    public Socio crearSocio(String nombre, int edad, String sexo, double peso, double altura) {
        Socio nuevoSocio = new Socio(nombre, edad, sexo, peso, altura, logger);
        logger.logearEvento("Socio creado: " + nombre);
        return nuevoSocio;
    }

    public void registrarPesaje(Socio socio, double peso) {
        socio.registrarPesaje(peso);
        logger.logearEvento("Pesaje registrado para socio: " + socio.obtenerDetalles());
    }

    public void agregarTrofeo(Socio socio, Trofeo trofeo) {
        socio.trofeos.add(trofeo);
        logger.logearEvento("Trofeo " + trofeo.getNombre() + " agregado al socio: " + socio.obtenerDetalles());
    }

    public String obtenerDetalles(Socio socio) {
        return socio.obtenerDetalles();
    }
}
