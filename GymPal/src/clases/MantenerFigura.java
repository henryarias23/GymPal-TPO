package clases;

public class MantenerFigura extends Objetivo {
    private double pesoOsilante;

    public MantenerFigura(String nombre, String descripcion, double pesoOsilante) {
        super(nombre, descripcion);
        this.pesoOsilante = pesoOsilante;
    }

    @Override
    public boolean cumplirObjetivo(Socio socio) {
        System.out.println("Verificando si el peso del socio está dentro del rango de mantenimiento.");
        double pesoActual = socio.getPeso();
        double rangoPermitido = 5.0;
        return pesoActual >= (pesoOsilante - rangoPermitido) && pesoActual <= (pesoOsilante + rangoPermitido);
    }

    @Override
    public void sugerirCambio(Socio socio) {
        System.out.println("Sugerencia de cambio: Para mantener su figura, su peso debe estar cercano a " + pesoOsilante + " kg, con un margen de ±5 kg.");
    }
}