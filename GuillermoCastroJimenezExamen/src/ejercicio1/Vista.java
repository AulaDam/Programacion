package ejercicio1;
import java.util.Scanner;

public class Vista {
    
    Scanner scanner = new Scanner(System.in);
    
    private Controlador controlador;
    
    public Vista() {
        controlador = new Controlador();
    }
    
    
    
    public void mostrarMenu() {
        
        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Crear nuevas zonas de almacen"); //
            System.out.println("2. Crear nuevos paquetes y asignar una zona de almacen");//
            System.out.println("3. Borrar un paquete"); //
            System.out.println("4. Borrar una zona si no tiene paquetes"); //
            System.out.println("5. Mover un paquete de una zona a otra");
            System.out.println("6. Listar todas las zonas"); //
            System.out.println("7. Listar todos los paquetes de una zona"); //
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    controlador.crearNuevasZonasDeAlmacen();
                    break;
                case 2:
                    controlador.crearPaqueteAsignarZona();
                    break;

                case 3:
                    controlador.borrarPaquete();
                    break;
                case 4:
                    controlador.borrarZonaVacia();
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    controlador.listarZonas();
                    break;
                case 7:
                    controlador.listarPaquetesZona();   
                    break;
                default:
                    System.out.println("");
                    break;
            }

        } while (opcion != 0);

        System.out.println("[-] Saliendo");
    }
    
    
        
        
        
        
}
    

