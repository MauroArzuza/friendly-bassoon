package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Lobo lobito = new Lobo("foto1", "alimento1", "Noruega", "Grande");
        lobito.hacerRuido();
        lobito.dormir();
        lobito.comer();
        lobito.rugir();
        System.out.println("Localizacion: " + lobito.getLocalizacion());
        System.out.println("Tamanio: " + lobito.getTamanio());
    }
}