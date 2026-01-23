package Multimedia.entidades;

public class Disco  extends Multimedia {
    
    private String genero;
    
    public Disco(String titulo, String autor, String formato, double duracion, String genero) {
        super(titulo, autor, formato, duracion);
        
        if (genero == null) {
            System.out.println("ERROR");
        }
        
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Disco{" + super.toString() + "genero=" + genero + '}';
    }
    
    
    
    
}
