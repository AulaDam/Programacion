package Multimedia;

import Multimedia.entidades.Multimedia;
import interfaces.IBDMultimedia;

public class BDMultimedia implements IBDMultimedia{
    
    //Singlenton: Guardamos la unica instancia de CentroAvisos dentro de la propia clase
    private static BDMultimedia instanciaBdMultimedia;
    
    private Multimedia[] articulosMultimedia;
    private int contador;
    
    //Singlenton: Para que nadie pueda acceder al constructor desde fuera se pone private
    private BDMultimedia() {
        articulosMultimedia = new Multimedia[20];
        contador = 0;
    }
    
    //Singlenton: Devuelve la instancia unica de BDMultimedia, si no existe se crea una
    public static BDMultimedia getInstancia(){
        if (instanciaBdMultimedia == null) {
            instanciaBdMultimedia = new BDMultimedia();
        }
        return instanciaBdMultimedia;
    }

    @Override
    public void agregarMultimedia(Multimedia multimedia) {
        articulosMultimedia[contador] = multimedia;
        contador++;
    }

    @Override
    public void mostrarDatos() {
        
        for (int i = 0; i<contador; i++) {
            System.out.println(articulosMultimedia[i]);
        }
        
    }
    
    
    
    
    
}
