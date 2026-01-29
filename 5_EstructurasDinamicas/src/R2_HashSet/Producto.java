package R2_HashSet;

public class Producto {
    
    private String nombre;
    private int cantidad;
    private double precioUnidad;
    
    public Producto(String nombre, int cantidad, double precioUnidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getTotal() {
        return precioUnidad * cantidad;
    }
    
    
    
    
}
