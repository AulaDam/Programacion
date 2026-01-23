package Alumnos;
import java.util.ArrayList;

public class GestorAlumnos {
    
    private ArrayList<Alumno> alumnosArray; //Lista de alumnos
    
    public GestorAlumnos() {
        alumnosArray = new ArrayList<>(); //Creas la lista vacia
    }
    
    //Añadir alumno
    public void agregarAlumno(Alumno a) {
        alumnosArray.add(a);
    }
    
    //Mostrar todos
    public void mostrarAlumnos(){
        for (Alumno a : alumnosArray) {
            System.out.println(a);
            System.out.println("---------");
        }
    }
    
    //Buscar alumno por su nombre
    public Alumno buscarAlumno(String nombreBuscar){
        
        for (Alumno a : alumnosArray) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscar)) {
                return a;
            }
        }
        
        return null;
    }
    
    //Eliminar alumno por su nombre
    public boolean eliminarAlumno(String nombreEliminar) {
        
        //Busca un alumno con el metodo anterior y lo guarda en a
        Alumno a = buscarAlumno(nombreEliminar);
        
        if (a != null) {
            alumnosArray.remove(a);
            return true;
        } else {
            return false;
        }
        
        
    }
    
    
    
    
    
    
    
    
}
