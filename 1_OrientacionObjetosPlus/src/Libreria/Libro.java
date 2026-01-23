package Libreria;

public class Libro {
    
    private int codigo;
    private String autor;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String lugarPublicacion;
    
    public Libro(int codigo, String autor, String tutorial, String editorial, int fechaPublicacion, String lugarPublicacion) {
        
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.lugarPublicacion = lugarPublicacion;
        
    }
    
    @Override
    public String toString() {
        return String.format("Codigo: %d\nAutor: %s\nTitulo: %s\nEditorial: %s\nFecha publicacion: %d\nLugar publicacion: %s",
                codigo, autor, titulo, editorial, fechaPublicacion, lugarPublicacion);
    }
    
    

    
}