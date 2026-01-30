package R2_HashSet;
import java.util.Scanner;

public class Controlador {
    
    private Lista lista;
    private Vista vista;
    
    private Scanner scanner;
    
    
    public Controlador() {
        lista = new Lista();
        vista = new Vista();
        scanner = new Scanner(System.in);
        
    }
    
    public void inicar() {
        
        int opcion = 0;
        
        do {
            
            vista.mostrarMenu();
            opcion = vista.pedirEntero("Opcion: ");
            
            switch(opcion) {
                case 1: {
                    //1. Agregar un producto
                    lista.agregarProducto(crearProducto());
                    break;
                }
                case 2: {
                    //2. Mostrar lista
                    lista.mostrarLista();
                    break;
                }
                case 3: {
                    //3. Modificar cantidad de un producto
                    String nombreProducto = vista.pedirTexto("[*] Nombre producto: ");
                    int cantidad = vista.pedirEntero("[*] Cantidad: ");
                    lista.modificarCantidad(nombreProducto, cantidad);
                    break;
                    
                }
                case 4: {
                    //4. Eliminar determinado producto
                    String nombreProducto = vista.pedirTexto("[*] Nombre producto: ");
                    lista.eliminarProducto(nombreProducto);
                    break;
                
                }
                case 5: {
                    //5. Obtener importe total
                    vista.mostrarMensaje("[-] Importe total:  " + lista.obtenerImporteTotal());
                    break;
                }
                case 6: {
                    //6. Eliminar lista
                    lista.eliminarLista();
                    break;
                }
                default: {
                    vista.mostrarMensaje("ERROR: Opcion invalida");
                    break;
                }
                
                
                
                
            }
            
        } while (opcion != 0);
        
        
        
        
        
        
    }
    
    public Producto crearProducto() {
        
        String nombre = vista.pedirTexto("[*] Nombre: ");
        int cantidad = vista.pedirEntero("[*] Cantidad: ");
        double precioUnidad = vista.pedirDouble("[*] Precio unidad: ");
        
        return new Producto(nombre, cantidad, precioUnidad);
        
    }
    

    
    
    
}
