package R1_Singleton;
import java.util.ArrayList;

public final class CentroAvisos {
    
    //Guardamos la unica instancia de CentroAvisos dentro de la propia clase
    //- Static: La variable pertenece a la clase, no a las instancias, existe una sola copia de esta variable en memoria
    //para toda la aplicacion, podemos acceder a ella sin crear objetos
    //- Volatile: Asegura que todos los hilos vean el valor más actualizado de instancia
    private static volatile CentroAvisos instancia;
    
    private ArrayList<String> avisos;
    
    //Para que nadie pueda acceder al constructor desde fuera se pone private
    private CentroAvisos() {
        avisos = new ArrayList<>();
    
    }
    
    //Devuelve la instancia unica de CentroAvisos y si no existe se crea una
    //Double checked locking: Usamos synchorozined, ester pone una especie de candado al metodo, solo un hilo
    //puede ejecutar ese metodo a la vez.
    public static CentroAvisos getInstancia() {
        if (instancia == null){ //Primer check, sin bloqueo
            synchronized (CentroAvisos.class) {
                if (instancia == null) { //Bloqueo solo si es necesario
                    instancia = new CentroAvisos(); //Segundo check, con bloqueo
                }
            }
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
