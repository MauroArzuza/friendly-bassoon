package Ejercicio;

public abstract class Vehiculo {
    private String duenio;
    private int ruedas, puertas;

    public Vehiculo() {
    }

    public Vehiculo(String duenio, int ruedas, int puertas) {
        this.duenio = duenio;
        this.ruedas = ruedas;
        this.puertas = puertas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public abstract void caracteristicas();
}
