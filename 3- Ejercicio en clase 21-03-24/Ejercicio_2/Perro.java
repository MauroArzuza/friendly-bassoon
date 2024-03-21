package Ejercicio_2;

public class Perro extends Canino{
    public Perro() {
    }

    public Perro(String foto, String comida, String localizacion, String tamanio) {
        super(foto, comida, localizacion, tamanio);
    }

    @Override
    public void comer() {
        System.out.println("El perro come...");
    }

    @Override
    public void hacerRuido() {
        System.out.println("El perro hace ruido...");
    }
    public void vacunar(){
        System.out.println("Al perro lo vacunan...");
    }
    public void sacarPaseo(){
        System.out.println("Al perro lo sacan de paseo...");
    }
}
