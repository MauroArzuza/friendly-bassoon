package Ejercicio_2;

public class Gato extends Felino{
    public Gato() {
    }

    public Gato(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void comer() {
        System.out.println("El gato come...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El gato hace ruido...");
    }
    public void vacunar(){
        System.out.println("Al gato lo vacunan...");
    }
}
