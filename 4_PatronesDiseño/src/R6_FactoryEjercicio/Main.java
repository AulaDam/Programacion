package R6_FactoryEjercicio;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Documento> documentos = new ArrayList<>();
        
        boolean continuar = true;
        
        do {
        
        System.out.print("[*] Tipo de documento: ");
        String tipo = scanner.nextLine();
        System.out.print("[*] Emisor del documento: ");
        String emisor = scanner.nextLine();
        System.out.print("[*] Importe del documento: ");
        double importe = scanner.nextDouble();
        scanner.nextLine();
        
        Documento miDocumento = DocumentoFactory.crearDocumento(tipo, emisor, importe);
        if (miDocumento != null) {
            documentos.add(miDocumento);
        } else {
            System.out.println("ERROR: Tipo de documento no valido");
        }
        
        System.out.print("[*] Crear otro documento S/N: ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("n")) continuar = false;  
        
        } while (continuar);
        
        System.out.println("Informacion de documentos:");
        for (Documento d : documentos) {
            d.mostrarDetalles();
            System.out.println("---------");
            
        }
        
        
        
        
        
        
        
    }
    
}
