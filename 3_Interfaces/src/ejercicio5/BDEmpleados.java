package ejercicio5;
import java.util.ArrayList;

public class BDEmpleados {
    
    private ArrayList<Administrativo> administrativos;
    private ArrayList<Maquinista> maquinistas;
    private ArrayList<Empleado> empleados;
    
    public BDEmpleados() {
        administrativos = new ArrayList<>();
        maquinistas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public ArrayList<Maquinista> getMaquinistas() {
        return maquinistas;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    
    
    public void introducirDatos() {
        
    }
    
}
