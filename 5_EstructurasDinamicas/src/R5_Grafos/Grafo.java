package R5_Grafos;
import java.util.HashMap;

public class Grafo {
    
    private HashMap<String, Escena> escenas;
    private String escenaInicialId;
    
    public Grafo() {
        escenas = new HashMap<>();
    }
    
    public void agregarEscena(Escena escena) {
        escenas.put(escena.getId(), escena);
    }
    
    public Escena obtenerEscena(String id) {
        return escenas.get(id);
    }
    
    public void setEscenaInicialId(String id) {
        this.escenaInicialId = id;
    }
    
    public Escena getEscenaInicialId() {
        return escenas.get(escenaInicialId);
    }
    
    
    
    
    
    
    
}
