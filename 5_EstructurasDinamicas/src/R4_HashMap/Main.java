package R4_HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Integer> contactos = new HashMap<>();
        
        Scanner scanner = new Scanner(System.in);
        
        
        //Crear lista
        contactos.put("Ana", 600123456);
        contactos.put("Luis", 600234567);
        contactos.put("María", 600345678);
        contactos.put("Carlos", 600456789);
        contactos.put("Elena", 600567890);
        
        //Mostrar contactos
        for(Map.Entry<String, Integer> entrada : contactos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
            
        }
        
        //Buscar contacto
        System.out.println("\nBUSCAR CONTACTO");
        System.out.print("[*] Nombre: ");
        String nombreBuscar = scanner.nextLine();
        
        if (contactos.containsKey(nombreBuscar)) {
            System.out.println("El numero de " + nombreBuscar + " es " + contactos.get(nombreBuscar));
        } else {
            System.out.println("ERROR: El contacto " + nombreBuscar + " no existe");
        }
        
        //Actualizar contacto
        System.out.println("\nACTUALIZAR CONTACTO");
        System.out.print("[*] Nombre: ");
        String nombreActualizar = scanner.nextLine();
        
        if (contactos.containsKey(nombreActualizar)) {
            System.out.print("[*] Numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            contactos.put(nombreActualizar, numero);
        } else {
            System.out.println("ERROR: El contacto " + nombreActualizar + " no existe");
        }
        
        //Eliminar contacto
        System.out.println("\nELIMINAR CONTACTO");
        System.out.print("[*] Nombre: ");
        String nombreEliminar = scanner.nextLine();
        
        if (contactos.containsKey(nombreEliminar)) {
            contactos.remove(nombreEliminar);
            System.out.println("[-] Contacto eliminado");
        } else {
            System.out.println("ERROR: El contacto no existe");
        }
        
        for (Map.Entry<String, Integer> entrada : contactos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
        
        
        
        
        
        
        
    }
    
}
