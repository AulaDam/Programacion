package ejercicio5;
import java.util.Scanner;

public abstract class Persona {
    
    protected String nombre;
    protected int edad;
    final protected double SUELDOBASE = 1800;
    
    Scanner scanner = new Scanner(System.in);
    
    public Persona() {
        pedirDatosComunes();
        
    } 
    
    protected void pedirDatosComunes() {
        System.out.print("[*] Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("[*] Edad: ");
        this.edad = scanner.nextInt();
        scanner.nextLine();
    }
    
    public abstract void pedirDatosEspecificos();
    
    
}
