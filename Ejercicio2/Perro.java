package Ejercicio2;

public class Perro extends Animal{
    private String raza, tamanio;

    public Perro() {
    }

    public Perro(String raza, String tamanio) {
        this.raza = raza;
        this.tamanio = tamanio;
    }

    public Perro(String nombre, String genero, int edad, String raza, String tamanio) {
        super(nombre, genero, edad);
        this.raza = raza;
        this.tamanio = tamanio;
    }

    @Override
    public void hacer_sonido() {
        System.out.println("El perro ladra...");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
