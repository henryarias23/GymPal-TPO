package clases;

public class NivelAerobico {
    public int valor;
    public InivelMuscular nivelMuscular;

    public NivelAerobico(int valor, InivelMuscular nivelMuscular) {
        this.valor = valor;
        this.nivelMuscular = nivelMuscular;
    }

    public String obtenerDetalles() {
        return "Nivel Aeróbico: " + valor + ", Nivel Muscular: " + nivelMuscular;
    }
}