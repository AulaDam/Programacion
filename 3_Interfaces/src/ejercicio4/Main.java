package ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Cliente cliente = new Cliente(scanner);
        Empleado empleado = new Empleado(scanner);
        
        cliente.pedirTodosDatos();
        cliente.visualizarTodosDatos();
        
        empleado.pedirTodosDatos();
        empleado.visualizarTodosDatos();
        
        
        
        
        

    }
    
}
