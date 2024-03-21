package Ejercicio02;

public class Oficial extends Operario{
    private String area;
    private double salario;

    public Oficial() {
    }

    public Oficial(String area, double salario) {
        this.area = area;
        this.salario = salario;
    }

    public Oficial(String funcion, int aniosAntiguedad, String area, double salario) {
        super(funcion, aniosAntiguedad);
        this.area = area;
        this.salario = salario;
    }

    public Oficial(String nombre, String genero, String funcion, int aniosAntiguedad, String area, double salario) {
        super(nombre, genero, funcion, aniosAntiguedad);
        this.area = area;
        this.salario = salario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void preguntarDatos(){
        System.out.println("El empleado se llama " + getNombre() + ", es un oficial que tiene la función de " +
                getFuncion() + ", tiene " + getAniosAntiguedad() + " anios de antiguedad, " +
                "esta en el area de " + getArea() + ", tiene un salario de " + getSalario() +
                " y es " + getGenero() + ".");
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "area = '" + area + '\'' +
                ", salario = " + salario +
                ", area = " + getArea() +
                ", salario = " + getSalario() +
                ", nombre = " + getNombre() +
                ", genero = " + getGenero() +
                '}';
    }
}
