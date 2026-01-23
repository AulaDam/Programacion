package ejercicio4;
import java.util.Scanner;

public class Empleado implements IPersona{
    
    private String nombre;
    private int codigo;
   
    Scanner scanner;
    
    public Empleado(Scanner scanner) {
        this.scanner = scanner; 
    }

    @Override
    public void pedirTodosDatos() {
        System.out.print("[*] Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("[*] Codigo: ");
        this.codigo = scanner.nextInt();
        scanner.nextLine();
        
    }

    @Override
    public void visualizarTodosDatos() {
        System.out.println("[-] Nombre: " + this.nombre);
        System.out.println("[-] Codigo: " + this.codigo);
        System.out.println("[-] Empresa: " + Empleado.EMPRESA);
        
    }
    
    
    
    
}
