package Multimedia.entidades;

public class Pelicula extends Multimedia {
    
    private String actorPrincipal;
    private String actrizPrincipal;
    


    public Pelicula(String titulo, String autor, String formato, double duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
        
    }

    @Override
    public String toString() {
        return "Pelicula{" + super.toString() + "actorPrincipal=" + actorPrincipal + ", actrizPrincipal=" + actrizPrincipal + '}';
    }
    
    
    
    
    
}
