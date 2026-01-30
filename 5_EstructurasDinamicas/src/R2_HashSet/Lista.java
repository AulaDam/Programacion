package R2_HashSet;
import java.util.HashSet;

public class Lista {
    
    private HashSet<Producto> listaProductos;
    
    public Lista() {
        this.listaProductos = new HashSet<>();
        
    }
    
    
    
    
    
    //1. Agregar producto
    public void agregarProducto(Producto p) {
        listaProductos.add(p);
        
    }
    
    //2. Mostrar lista
    public void mostrarLista() {
        
        for (Producto p : listaProductos) {
            
            System.out.println("[-] Nombre: " + p.getNombre());
            System.out.println("[-] Cantidad: " + p.getCantidad());
            System.out.println("[-] Precio unidad: " + p.getPrecioUnidad());
            
        }
    
    }
    
    //3. Modificar cantidad de un determinado producto
    public void modificarCantidad(String producto, int cantidad) {
        
        for (Producto p : listaProductos) {
            if (p.getNombre().equalsIgnoreCase(producto)) {
                p.setCantidad(cantidad);
                return;
            }
        }
        
    }
    
    //4. Eliminar un producto
    public void eliminarProducto(String producto) {
        
        for (Producto p : listaProductos) {
            if (p.getNombre().equalsIgnoreCase(producto)) {
                listaProductos.remove(p);
                return;
            }
        }
        
    }
    
    //5. Obtener importe total
    public double obtenerImporteTotal() {
        
        double importeTotal = 0;
        for (Producto p : listaProductos) {
            importeTotal+=p.getTotal();
        }
        
        return importeTotal;
        
    }
    
    //6. Eliminar lista
    public void eliminarLista() {
        
        listaProductos.clear();
        
    }
    
    
    
    
}
