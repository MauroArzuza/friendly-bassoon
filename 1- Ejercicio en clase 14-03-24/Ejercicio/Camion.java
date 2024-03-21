package Ejercicio;

public class Camion extends Vehiculo {
    private float carga;
    public Camion() {
    }
    public Camion(float carga, String duenio, int ruedas, int puertas) {
        super(duenio, ruedas, puertas);
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
    public void cargar(){
        System.out.println("Cargando...");
    };
    public void caracteristicas(){
        System.out.println("Duenio: " + this.getDuenio());
        System.out.println("Ruedas: " + this.getRuedas());
        System.out.println("Puertas: " + this.getPuertas());
        if(carga >= 1000){
            System.out.println("El camion esta sobrecargado");
        }else{
            System.out.println("Puede pasar.");
        }
    }
}
