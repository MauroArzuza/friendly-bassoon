package Ejercicio;

public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto() {
    }

    public Auto(String duenio, int ruedas, int puertas, boolean descapotable) {
        super(duenio, ruedas, puertas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar(){
        System.out.println("Baja");
    }
    public void subir(){
        System.out.println("Sube");
    }
    public void caracteristicas(){
        System.out.println("Duenio: " + this.getDuenio());
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: " + this.getRuedas());
        if(descapotable){
            System.out.println("Es descapotable.");
        }else{
            System.out.println("No es descapotable.");
        }
    }
}
