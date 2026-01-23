package ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;


public class ZonaAlmacen {
    
    private int codigo;
    private ArrayList<Paquete> paquetes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }
    
    
    
    public ZonaAlmacen() {
        paquetes = new ArrayList<>();
    }
    
    public ZonaAlmacen(int codigo) {
        this.codigo = codigo;
        paquetes = new ArrayList<>();
    }
    
    
    
    
    
    
}
