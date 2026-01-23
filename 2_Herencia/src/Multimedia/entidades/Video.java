package Multimedia.entidades;

public class Video extends Multimedia {
    
    public Video(String titulo, String autor, String formato, double duracion) {
        
        super(titulo, autor, formato, duracion);
        
    }

    @Override
    public String toString() {
        return "Video{" + super.toString() + '}';
    }
    
    
    
    
}
