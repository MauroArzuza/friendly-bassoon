package Ejercicio2;

public class Gato extends Animal{
    private String color, ojos;

    public Gato() {
    }

    public Gato(String color, String ojos) {
        this.color = color;
        this.ojos = ojos;
    }

    public Gato(String nombre, String genero, int edad, String color, String ojos) {
        super(nombre, genero, edad);
        this.color = color;
        this.ojos = ojos;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El gato maulla...");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", ojos='" + ojos + '\'' +
                '}';
    }
}
