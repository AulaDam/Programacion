package Multimedia.entidades;

//Multimedia es abstracto porque no es nada por si mismo, no se puede guardar en la base de datos
public abstract class Multimedia {
    
    private String titulo;
    private String autor;
    private String formato;
    private double duracion;
    
    public Multimedia(String titulo, String autor, String formato, double duracion) {
        
        if (titulo == null || autor == null || formato == null) {
            System.out.println("ERROR");
        }
        
        if (duracion < 0 || duracion > 100) {
            System.out.println("ERROR");
        }
        
        
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        
    }
    
    public boolean formato(String formato) {
        return formato.equals("wav") || formato.equals("mp3") || formato.equals("avi") || formato.equals("dvd");
        
    }
    
    
    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
    }
    
    
    
}
