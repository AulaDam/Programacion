package ejercicio1;
import java.util.Scanner;
import java.util.ArrayList;

public class Controlador {
    
    Scanner scanner = new Scanner(System.in);
    private ArrayList<ZonaAlmacen> zonas;
    
    private Vista vista;

    
    public Controlador() {
        zonas = new ArrayList<>();
        
        
        
    }
    
    public void menuOpciones() {
        //vista.mostrarMenu();
        vista = new Vista();
        vista.mostrarMenu();
    }
    
    
    //1. Crear nuevas zonas de Almacen
    public void crearNuevasZonasDeAlmacen() {
        
        System.out.println("[*] Cuantas zonas quieres crear: ");
        int numeroZonas = scanner.nextInt();
        scanner.nextLine();
        
        for (int i=0; i<numeroZonas; i++) {
        
            System.out.println("ZONA " + (i+1));
            
            System.out.print("Codigo de zona: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            
            zonas.add(new ZonaAlmacen(codigo));
            
            
        }
        
    }
    
    //2. Crear nuevos paquetes y asignar zona de almacen
    public void crearPaqueteAsignarZona() {
        
        System.out.print("[*] Codigo paquete: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        Paquete p = new Paquete(codigo);
        
        for (ZonaAlmacen z : zonas) {
            System.out.println("[*] Asignar paquete a la zona " + z.getCodigo() + " S/N: ");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("S")) {
                z.getPaquetes().add(p);
                return;
            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("");
            }
            
        }
        
        System.out.println("prueba");
        
        
    }
    
    //3. Borrar paquete
    public void borrarPaquete() {
        
        for (ZonaAlmacen z : zonas) {
        
            System.out.println("[*] Borrar paquete de zona " + z.getCodigo() + " S/N: ");
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("S")) {
                System.out.print("[*] Introduce el codigo del paquete a borrar: ");
                int codigoBorrar = scanner.nextInt();
                
                for (Paquete p : z.getPaquetes()) {
                    if (p.getCodigo() == codigoBorrar) {
                        z.getPaquetes().remove(p);
                        System.out.println("[-] Paquete borrado");
                    }
                }
                return;
            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("");
            }
        }
        
    }
    
    //4. Borrar zona paquetes si no tienes paquete
    public void borrarZonaVacia(){
        for (ZonaAlmacen z : zonas) {
            if (z.getPaquetes().isEmpty()) {
                zonas.remove(z);
                System.out.println("[-] Zona borrada");
            }
        }
    }
    
    //5. Mover un paquete de una zona a otra
    public void moverPaquete() {
        System.out.print("[*] Introduce el codigo de la zona de la que quieres mover el paquete: ");
        int codigoZonaAntigua = scanner.nextInt();
        
        for (ZonaAlmacen z : zonas) {
            if (z.getCodigo() == codigoZonaAntigua) {
                System.out.println("[-] Paquetes: ");
                z.getPaquetes();
                
            }
        }
        
    }
    
    //6. Listar todas las zonas
    
    public void listarZonas() {
        int contador = 0;
        
        for (ZonaAlmacen z : zonas) {
            
            System.out.println("["+(contador + 1)+"] Zona codigo: " + z.getCodigo());
            
        }
        
        System.out.println("");
    }
    
    //7. Listar todos los paquetes de una zona
    
    public void listarPaquetesZona() {
        System.out.print("[*] Introduce el codigo de la zona que quieres listar sus paquetes: ");
        int codigo = scanner.nextInt();
        boolean zonaListada = false;
        scanner.nextLine();
        
        for (ZonaAlmacen z : zonas) {
            if (z.getCodigo() == codigo) {
                z.getPaquetes();
                zonaListada = true;
                return;
            }
        }
        
        if (!zonaListada) {
            System.out.println("[-] No existe una zona con el codigo " + codigo);
        }
        
        
    }    
    
    
    
    
}
