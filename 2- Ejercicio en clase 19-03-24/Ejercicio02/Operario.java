package Ejercicio02;

public class Operario extends Empleado{
    private String funcion;
    private int aniosAntiguedad;

    public Operario() {
    }

    public Operario(String funcion, int aniosAntiguedad) {
        this.funcion = funcion;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public Operario(String nombre, String genero, String funcion, int aniosAntiguedad) {
        super(nombre, genero);
        this.funcion = funcion;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public void preguntarDatos(){
        System.out.println("El empleado se llama " + getNombre() + ", es un operario que tiene la función de " +
                getFuncion() + ", tiene " + getAniosAntiguedad() + " anios de antiguedad y es " + getGenero() + ".");
    }

    @Override
    public String toString() {
        return "Operario{" +
                "funcion = '" + funcion + '\'' +
                ", aniosAntiguedad = " + aniosAntiguedad +
                ", nombre = " + getNombre() +
                ", genero = " + getGenero() +
                '}';
    }
}
