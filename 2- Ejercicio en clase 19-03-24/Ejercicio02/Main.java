package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        Oficial oficial1 = new Oficial("Ernesto", "Masculino", "Inspeccion", 5,
                "Electricidad", 180000);
        oficial1.preguntarDatos();
        Técnico tecnico1 = new Técnico("Ana", "Femenino", "Inspección", 7,
                "Mecánica", 180000);
        tecnico1.preguntarDatos();
    }
}
