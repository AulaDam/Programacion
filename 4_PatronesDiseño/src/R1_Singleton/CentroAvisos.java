package R1_Singleton;
import java.util.ArrayList;

public class CentroAvisos {
    
    //Guardamos la unica instancia de CentroAvisos dentro de la propia clase
    private static CentroAvisos instancia;
    
    private ArrayList<String> avisos;
    
    //Para que nadie pueda acceder al constructor desde fuera se pone private
    private CentroAvisos() {
        avisos = new ArrayList<>();
    
    }
    
    //Devuelve la instancia unica de CentroAvisos y si no existe se crea una
    public static CentroAvisos getInstancia() {
        if (instancia == null){
            instancia = new CentroAvisos();
        }
        return instancia;
    }
    
    public void publicarAviso(String aviso) {
        avisos.add(aviso);
    }
    
    public void obtenerAvisos() {
        for (String a: avisos) {
            System.out.println(a);
        }
        
    }
    
        
    
    
    
    
    
    
    
    
}
