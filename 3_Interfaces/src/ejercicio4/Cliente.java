package ejercicio4;
import java.util.Scanner;

public class Cliente implements IPersona{

    private String nombre;
    private double compra;
    
    Scanner scanner;
    
    public Cliente(Scanner scanner) {
        this.scanner = scanner;
    }
    
    @Override
    public void pedirTodosDatos() {
        System.out.print("[*] Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("[*] Compra: ");
        this.compra = scanner.nextDouble();
        scanner.nextLine();
        
    }

    @Override
    public void visualizarTodosDatos() {
        System.out.println("[-] Nombre: " + this.nombre);
        System.out.println("[-] Compra: " + this.compra);
        System.out.println("[-] Empresa: " + Cliente.EMPRESA);
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
