package Evangelion;
import java.util.ArrayList;

public class GestorPilotos {
    
    private ArrayList<Piloto> pilotosArray;
    
    public GestorPilotos() {
        pilotosArray = new ArrayList<>();
    }
    
    public void agregarPiloto(Piloto p) {
        pilotosArray.add(p);
    }
    
    public void mostrarPilotos() {
        for (Piloto p : pilotosArray) {
            System.out.println(p);
        }
        System.out.println("------");
    }
    
    
    
    
}
