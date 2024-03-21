package Ejercicio02;
public class Empleado {
    private String nombre, genero;

    public Empleado() {
    }

    public Empleado(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void preguntarDatos(){
        System.out.println("El empleado se llama " + this.nombre + " y es " + this.genero + ".");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
