package Evangelion;

public class Piloto {
    
    private String nombre;
    private int edad;
    private double sincronizacion;
    
    public Piloto(String nombre, int edad, double sincronizacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sincronizacion = sincronizacion;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double getSincronizacion() {
        return this.sincronizacion;
    }
    
    public void setSincronizacion(double sincronizacion) {
        this.sincronizacion = sincronizacion;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Sincronizacion: " + sincronizacion + "\n";
    }
    
    
}
