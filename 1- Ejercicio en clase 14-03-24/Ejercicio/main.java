package Ejercicio;

public class main {
    public static void main(String[] args) {
        Auto autito = new Auto("Jorge", 4, 2, false);
        autito.caracteristicas();
        autito.bajar();
        autito.subir();
        autito.getPuertas();
        autito.isDescapotable();
        Camion camioncito = new Camion();
        camioncito.setCarga(1250);
        camioncito.setDuenio("Alberto");
        camioncito.setPuertas(2);
        camioncito.setRuedas(6);
        camioncito.cargar();
        camioncito.caracteristicas();
    }
}
