package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Perro perrito = new Perro("Pancho", "Macho", 6, "Caniche", "Pequenio");
        Gato gatito = new Gato("Alberto", "Macho", 9, "negro","azules");
        Pajaro pajarito = new Pajaro("Ana", "Hembra", 2, "Canario", "Amarillo");
        perrito.informacion(perrito);
        gatito.informacion(gatito);
        pajarito.informacion(pajarito);
        perrito.hacer_sonido();
        gatito.hacer_sonido();
        pajarito.hacer_sonido();
    }
}
