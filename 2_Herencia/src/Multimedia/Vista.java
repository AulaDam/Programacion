package Multimedia;
import java.util.Scanner;

public class Vista {
    
    private Scanner scanner;
    
    public Vista() {
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        System.out.println("[1] Agregar multimedia");
        System.out.println("[2] Mostrar multimedia");
        System.out.println("[0] Salir");
    }
    
    public void menuAgregarMultimedia() {
        System.out.println("[1] Pelicula");
        System.out.println("[2] Disco");
        System.out.println("[3] Video");
    }
    
    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
    
    public double pedirDouble(String mensaje) {
        System.out.print(mensaje);
        double numero = scanner.nextDouble();
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
