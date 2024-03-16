package Ejercicio1;

public class Coche extends Vehículo{
    private int velocidad;
    private double cilindrada;

    public Coche() {
    }

    public Coche(int velocidad, double cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Coche(int velocidad, double cilindrada, String color, int ruedas) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "velocidad = " + velocidad +
                ", cilindrada = " + cilindrada +
                ", color = " + getColor() +
                ", ruedas = " + getRuedas() +
                '}';
    }
}
