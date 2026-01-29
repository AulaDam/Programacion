package R5_FactoryVideo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ConexionFactory fabrica;
        Conexion conexion;
        
        System.out.print("[*] Introduce el tipo de conexion: ");
        String tipo = scanner.nextLine();
        
        fabrica = new ConexionFactory(tipo);
        conexion = fabrica.crearConexion();
        
        System.out.println(conexion.descripcion());
        
        
        
        
        
        
        
        
        
        
    }
    
}
