package Ejercicio_2;

public abstract class Canino extends Animal {
    public Canino() {
    }

    public Canino(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void rugir() {
        System.out.println("El canino ladra...");
    }

}
