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
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getPrecioUnidad() {
        return precioUnidad;
    }
    
    public double getTotal() {
        return precioUnidad * cantidad;
    }
    
    //El metodo equals en lugar de comparar las direcciones en memoria ahora compara los nombres
    @Override
    public boolean equals(Object o) {
        //Es el mismo objeto en memoria
        if (this == o) return true;
        //Es null o de otra clase
        if (o == null || getClass() != o.getClass()) return false;
        
        //Convertir a producto para poder comparar
        Producto producto = (Producto) o;
        
        //Dos productos son iguales si tienen el mismo nombre
        return nombre.equalsIgnoreCase(producto.nombre);
        
    } 
    
    //HAce que el hashcode se base en el nombre en minusculas, asi dos objetos con el mismo
    //nombre tendran el mismo hashcode
    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
        
    }
    
    
}
