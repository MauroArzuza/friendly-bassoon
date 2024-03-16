package Ejercicio1;

public class Camioneta extends Vehículo{
    private double carga;

    public Camioneta() {
    }

    public Camioneta(double carga) {
        this.carga = carga;
    }

    public Camioneta(double carga, String color, int ruedas) {
        super(color, ruedas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "carga = " + carga +
                "color = " + getColor() +
                "ruedas = " + getRuedas() +
                '}';
    }
}
