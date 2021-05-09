package ejercicio1a;

public class Auto {
    
    String color;
    String marca;
    String modelo;
    String patente;
    int cantidadPuertas;

    public Auto(String color, String marca, String modelo, String patente, int cantidadPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    void mostrarDatos(Auto auto){
       System.out.println("Marca: " + auto.getMarca());
       System.out.println("Modelo: " + auto.getModelo());
       System.out.println("Patente: " + auto.getPatente());
    }  
    
}
