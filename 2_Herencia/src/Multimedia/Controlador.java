package Multimedia;

import Multimedia.daos.DaoDisco;
import Multimedia.daos.DaoPelicula;
import Multimedia.daos.DaoVideo;
import Multimedia.entidades.Video;
import Multimedia.entidades.Pelicula;
import Multimedia.entidades.Disco;

public class Controlador {
    
    //Base de datos
    private BDMultimedia datosMultimedia;
    
    //Dao
    private DaoDisco daoDisco;
    private DaoPelicula daoPelicula;
    private DaoVideo daoVideo;
    
    private Vista vista;
    
    public Controlador() {
        //Singlenton
        datosMultimedia = BDMultimedia.getInstancia();
        daoDisco = new DaoDisco(datosMultimedia);
        daoPelicula = new DaoPelicula(datosMultimedia);
        daoVideo = new DaoVideo(datosMultimedia);
        vista = new Vista();
    }
    
    public void iniciar() {
        
        int opcion = 0;
        
        do {
            vista.mostrarMenu();
            opcion = vista.pedirEntero("Opcion: "); 
            
            switch (opcion) {
                case 1:
                    
                    String titulo = vista.pedirTexto("[*] Titulo: ");
                    String autor = vista.pedirTexto("[*] Autor: ");
                    String formato = vista.pedirTexto("[*] Formato: ");
                    double duracion = vista.pedirDouble("[*] Duracion: ");
                    
                    vista.menuAgregarMultimedia();
                    
                    int tipoMultimedia = vista.pedirEntero("Opcion: ");
                    
                            switch (tipoMultimedia) {
                                case 1:
                                    String actorPrincipal = vista.pedirTexto("[*] Actor principal: ");
                                    String actrizPrincipal = vista.pedirTexto("[*] Actriz principal: ");
                                    Pelicula pelicula = new Pelicula(titulo, autor, formato, duracion, actorPrincipal, actrizPrincipal);
                                    daoPelicula.guardarPelicula(pelicula);
                                    break;
                                case 2:
                                    String genero = vista.pedirTexto("[*] Genero: ");
                                    Disco disco = new Disco(titulo, autor, formato, duracion, genero);
                                    daoDisco.guardarDisco(disco);
                                    break;
                                case 3:
                                    Video video = new Video(titulo, autor, formato, duracion);
                                    daoVideo.guardarVideo(video);
                                    break;
                                default:
                                    vista.mostrarMensaje("ERROR: Opcion invalida");
                                    break;
                            }
                            
                   break;         
                            
                            
                case 2:
                    
                    datosMultimedia.mostrarDatos();
                    break;
                 
                default:
                    
                    vista.mostrarMensaje("ERROR: Opcion invalida");
                    
                    
                           
                    
            }
            
        } while (opcion != 0);
        
    }
    
    
    
}
