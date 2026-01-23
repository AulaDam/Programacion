package R1_Singleton;

public class Main {
    public static void main(String[] args) {
        
        //Creamos el primer centro de avisos
        CentroAvisos centroAvisosUnico = CentroAvisos.getInstancia();
        
        centroAvisosUnico.publicarAviso("1. Aviso");
        centroAvisosUnico.publicarAviso("2. Aviso");
        
        centroAvisosUnico.obtenerAvisos();
        
        //Creamos otro centro de avisos, pero al apuntar a la misma instancia sigue siendo el mismo
        CentroAvisos centroAvisosNuevo = CentroAvisos.getInstancia();
        
        centroAvisosNuevo.publicarAviso("3. Aviso");
        
        centroAvisosNuevo.obtenerAvisos();
        
        
        
        
    }
    
}
