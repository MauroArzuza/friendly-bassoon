package Ejercicio1;

public class Motocicleta extends Vehículo{
    private int velocidad;
    private double cilindrada;

    public Motocicleta() {
    }

    public Motocicleta(int velocidad, double cilindrada) {
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public Motocicleta(String color, int ruedas, int velocidad, double cilindrada) {
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
        return "Motocicleta{" +
                "velocidad = " + velocidad +
                ", cilindrada = " + cilindrada +
                ", color = " + getColor() +
                ", ruedas = " + getRuedas() +
                '}';
    }
}
