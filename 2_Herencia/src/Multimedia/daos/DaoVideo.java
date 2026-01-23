package Multimedia.daos;

import Multimedia.BDMultimedia;
import Multimedia.entidades.Video;
import interfaces.IDaoVideo;



public class DaoVideo implements IDaoVideo {

    BDMultimedia bd;
    
    public DaoVideo(BDMultimedia bd) {
        this.bd = bd;
    }
    
    //Guardar video en la base de datos
    @Override
    public void guardarVideo(Video video) {
        bd.agregarMultimedia(video);
        
    }
    
}
