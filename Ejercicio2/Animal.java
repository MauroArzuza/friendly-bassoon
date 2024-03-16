package Ejercicio2;

public abstract class Animal {
    private String nombre, genero;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacer_sonido(){
        System.out.println("El animal hace un sonido genérico.");
    }
    public void informacion(Animal animalito){
        System.out.println(animalito.toString());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }
}
