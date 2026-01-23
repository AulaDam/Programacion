package Multimedia.daos;

import interfaces.IDaoDisco;
import Multimedia.BDMultimedia;
import Multimedia.entidades.Disco;

public class DaoDisco implements IDaoDisco{
    
    BDMultimedia bd;
    
    public DaoDisco(BDMultimedia bd){
        this.bd=bd;
    }
      
    //Guardar disco en la base de datos
    @Override
    public void guardarDisco(Disco disco) {
        
        bd.agregarMultimedia(disco);
       
    }
    
    
   
    
}
