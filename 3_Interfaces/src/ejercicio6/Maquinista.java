package ejercicio6;
import ejercicio5.*;
import java.util.Scanner;

public class Maquinista extends Persona{
    
    private int numeroMaquina;
    private int cantidadTiempo;
    
    Scanner scanner;
    
    public Maquinista() {
        scanner = new Scanner(System.in);
        pedirDatosEspecificos();
    
    }

    @Override
    public void pedirDatosEspecificos() {
        System.out.print("[*] Numero maquina: ");
        this.numeroMaquina = scanner.nextInt();
        System.out.print("[*] Cantidad tiempo: ");
        this.cantidadTiempo = scanner.nextInt();
        
    }

    @Override
    public void visualizarTodosDatos() {
        System.out.println(toString());
        
    }

    @Override
    public String toString() {
        return "Maquinista\n" + super.toString() + "\n[-] Numero maquina: " + this.numeroMaquina + "\n[-] Cantidad tiempo: " + this.cantidadTiempo;
    }
    
    
    
}
