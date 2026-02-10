package R5_Grafos;
import java.util.List;
import java.util.ArrayList;

public class Escena {
    
    private String id;
    private String descripcion;
    private List<Decision> decisiones;
    private boolean esFinal;
    
    public Escena(String id, String descripcion, boolean esFinal) {
        this.id = id;
        this.descripcion = descripcion;
        this.decisiones = new ArrayList<>();
        this.esFinal = esFinal;
        
    }
    
    public void agregarDecision(Decision decision) {
        decisiones.add(decision);
    }
    
    //Getters

    public String getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Desicion> getDecisiones() {
        return decisiones;
    }

    public boolean isEsFinal() {
        return esFinal;
    }
    
    
    
    
    
    
}
