package Ejercicio02;

public class Técnico extends Operario{
    private String especialidad;
    private double salario;

    public Técnico() {
    }

    public Técnico(String especialidad, double salario) {
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Técnico(String funcion, int aniosAntiguedad, String especialidad, double salario) {
        super(funcion, aniosAntiguedad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Técnico(String nombre, String genero, String funcion, int aniosAntiguedad, String especialidad, double salario) {
        super(nombre, genero, funcion, aniosAntiguedad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void preguntarDatos(){
        System.out.println("El empleado se llama " + getNombre() + ", es un técnico que tiene la función de " +
                getFuncion() + ", tiene " + getAniosAntiguedad() + " anios de antiguedad, " +
                "su especialidad es " + getEspecialidad() + ", su salario es " + getSalario() +
                " y es " + getGenero() + ".");
    }

    @Override
    public String toString() {
        return "Técnico{" +
                "especialidad = '" + especialidad + '\'' +
                ", salario = " + salario +
                ", funcion = " + getFuncion() +
                ", aniosAntiguedad = " + getAniosAntiguedad() +
                ", nombre = " + getNombre() +
                ", genero = " + getGenero() +
                '}';
    }
}
