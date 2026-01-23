package Multimedia.daos;

import Multimedia.BDMultimedia;
import Multimedia.entidades.Pelicula;
import interfaces.IDaoPelicula;

public class DaoPelicula implements IDaoPelicula {
    
    BDMultimedia bd;
    
    public DaoPelicula(BDMultimedia bd) {
        this.bd = bd;
    }

    //Guardar pelicula en la base de datos
    @Override
    public void guardarPelicula(Pelicula pelicula) {
        
        bd.agregarMultimedia(pelicula);
        
    }

    
    
}
