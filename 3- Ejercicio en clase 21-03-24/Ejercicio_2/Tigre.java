package Ejercicio_2;

public class Tigre extends Felino{
    public Tigre() {
    }

    public Tigre(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void hacerRuido() {
        System.out.println("El tigre hace ruido...");
    }

    @Override
    public void comer() {
        System.out.println("El tigre come...");
    }
}
