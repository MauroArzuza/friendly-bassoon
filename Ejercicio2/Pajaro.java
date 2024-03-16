package Ejercicio2;

public class Pajaro extends Animal{
    private String especie, color;

    public Pajaro() {
    }

    public Pajaro(String especie, String color) {
        this.especie = especie;
        this.color = color;
    }

    public Pajaro(String nombre, String genero, int edad, String especie, String color) {
        super(nombre, genero, edad);
        this.especie = especie;
        this.color = color;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El pajaro canta...");
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
