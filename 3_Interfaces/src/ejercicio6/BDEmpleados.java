package ejercicio6;
import ejercicio5.*;
import java.util.ArrayList;

public class BDEmpleados {
    
    private ArrayList<Persona> administrativos;
    private ArrayList<Persona> maquinistas;
    private ArrayList<Persona> empleados;
    
    public BDEmpleados() {
        administrativos = new ArrayList<>();
        maquinistas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public ArrayList<Persona> getAdministrativos() {
        return administrativos;
    }

    public ArrayList<Persona> getMaquinistas() {
        return maquinistas;
    }

    public ArrayList<Persona> getEmpleados() {
        return empleados;
    }
    
    
    
    public void introducirDatos() {
        
    }
    
}
