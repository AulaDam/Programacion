package Alumnos;

public class Alumno {

    private String nombre;
    private int edad;
    private double notaMedia;
    
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public double getNotaMedia(){
        return notaMedia;
    }
    
    public void setNotaMedia(double notaMedia){
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Nota media: " + notaMedia;
    }
    
    
    
    
    
    
    
    
    
}
