package ejercicio6;
import ejercicio5.*;
import java.util.Scanner;

public class Administrativo extends Persona {
    
    private String estudiosAcademicos;
    private int numeroOrdenador;
    
    Scanner scanner;
    
    public Administrativo () {
        scanner = new Scanner(System.in);
        pedirDatosEspecificos();
    }

    @Override
    public void pedirDatosEspecificos() {
        System.out.print("[*] Estudios academicos: ");
        this.estudiosAcademicos = scanner.nextLine();
        System.out.print("[*] Numero ordenador: ");
        this.numeroOrdenador = scanner.nextInt();
        scanner.nextLine();
        
    }

    @Override
    public void visualizarTodosDatos() {
        System.out.println(toString());
        
    }

    @Override
    public String toString() {
        return "Administrativo\n" + super.toString() + "\n[-] Estudios academicos: " + this.estudiosAcademicos + "\n[-] Numero ordenador: " + this.numeroOrdenador; 
    }
    
    
    
    
}
