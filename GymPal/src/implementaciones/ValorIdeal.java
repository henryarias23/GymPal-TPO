package implementaciones;

import interfaces.AdacterValorIdeal;

public class ValorIdeal implements AdacterValorIdeal {
    private double peso;

    public ValorIdeal(double peso) {
        this.peso = peso;
    }

    @Override
    public double nivelMasaMuscular() {
        return peso * 0.3;
    }

    @Override
    public double porcentajeGrasaCorporal() {
        return peso * 0.15;
    }
}

