package Ejercicio_2;

public class Leon extends Felino{
    public Leon() {
    }

    public Leon(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void comer() {
        System.out.println("El leon come...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El leon hace ruido...");
    }
}
