package R2_HashSet;
import java.util.Scanner;

public class Controlador {
    
    Lista lista = new Lista();
    
    Scanner scanner = new Scanner(System.in);
    
    public Controlador() {
        
    }
    
    public void inicar() {
        
        System.out.println("");
        
    }
    
    public void mostrarMenu() {
        System.out.println("1. Insertar producto");
        System.out.println("2. Mostrar lista");
        System.out.println("3. Modificar cantidad");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Obtener importe total");
        System.out.println("6. Eliminar lista completa");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }
    
    
    
}
