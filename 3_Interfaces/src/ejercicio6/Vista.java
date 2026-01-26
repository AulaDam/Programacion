package ejercicio6;
import ejercicio5.*;
import java.util.Scanner;

public class Vista {
    
    private Scanner scanner;
    
    public Vista() {
        scanner = new Scanner(System.in);
        
    }
    
    public void mostrarMenuInformacion() {
        System.out.println("[1] Informacion de administrativos");
        System.out.println("[2] Informacion de maquinistas");
        System.out.println("[3] Informacion de empleados");
    }
    
    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
    
    public String pedirTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
        
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    
}
