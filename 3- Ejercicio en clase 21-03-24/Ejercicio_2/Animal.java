package Ejercicio_2;

public abstract class Animal {
    private String foto, comida, localizacion, tamanio;

    public Animal() {
    }
    public Animal(String foto, String comida, String localizacion, String tamanio) {
        this.foto = foto;
        this.comida = comida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
    }

    public abstract void hacerRuido();
    public abstract void comer();
    public void dormir(){
        System.out.println("El animal duerme...");
    }
    public abstract void rugir();

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
