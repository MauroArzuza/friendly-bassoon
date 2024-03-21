package Ejercicio_2;

public abstract class Felino extends Animal{
    public Felino() {
    }

    public Felino(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void rugir() {
        System.out.println("El felino maulla...");
    }
}
