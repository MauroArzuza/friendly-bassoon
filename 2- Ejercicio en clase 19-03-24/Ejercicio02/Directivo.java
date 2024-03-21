package Ejercicio02;

public class Directivo extends Empleado{
    private String cargo;
    private int aniosExperiencia;

    public Directivo() {
    }

    public Directivo(String cargo, int aniosExperiencia) {
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Directivo(String nombre, String genero, String cargo, int aniosExperiencia) {
        super(nombre, genero);
        this.cargo = cargo;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void preguntarDatos(){
        System.out.println("El empleado se llama " + getNombre() + ", es un directivo que tiene el cargo de " +
                getCargo() + ", tiene " + getAniosExperiencia() + " anios de experiencia y es " + getGenero() + ".");
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "cargo = '" + cargo + '\'' +
                ", aniosExperiencia = " + aniosExperiencia +
                ", nombre = " + getNombre() +
                ", genero = " + getGenero() +
                '}';
    }
}
