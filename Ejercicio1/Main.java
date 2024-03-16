package Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehículo> vehiculos = new ArrayList<>();
        Camioneta camionetita = new Camioneta(1200, "Rojo", 6);
        Coche autito = new Coche(220, 18, "Blanco", 4);
        Bicicleta bici = new Bicicleta("Verde", 2, "Urbana");
        Motocicleta moto = new Motocicleta("Negro", 2, 180, 9);
        vehiculos.add(camionetita);
        vehiculos.add(autito);
        vehiculos.add(bici);
        vehiculos.add(moto);

        catalogar(vehiculos);
    }
    public static void catalogar(ArrayList<Vehículo> vehiculos){
        System.out.println("Catalogo de vehículos: ");
        for(Vehículo vehiculo : vehiculos){
            System.out.println(vehiculo.toString());
        }
    }
}
