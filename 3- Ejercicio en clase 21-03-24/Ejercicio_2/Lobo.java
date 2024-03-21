package Ejercicio_2;

public class Lobo extends Canino{
    public Lobo() {
    }

    public Lobo(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void hacerRuido() {
        System.out.println("El lobo hace ruido...");
    }

    @Override
    public void comer() {
        System.out.println("El lobo come...");
    }

}
