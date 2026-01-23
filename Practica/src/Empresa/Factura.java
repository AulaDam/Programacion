package Empresa;
import java.util.Scanner;
import java.util.ArrayList;

public class Factura {
    
    private int codigo;
    private String proovedor;
    private ArrayList<Articulo> articulos;
    private double importeTotal;
    
    public Factura(int codigo, String proovedor) {
        this.codigo = codigo;
        this.proovedor = proovedor;
        articulos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    
    
    public void agregarArticulo(int codigo, String nombre, double precio) {
        
        Articulo a = new Articulo(codigo, nombre, precio);
        articulos.add(a);
        
    }
    
    public double obtenerImporteTotal() {
        
        double importeTotal = 0;
        
        for (Articulo a : articulos) { 
            importeTotal += a.getPrecio();
        }
        
        return importeTotal;
        
    }

    @Override
    public String toString() {
        return "Codigo" + codigo + "Proovedor " + proovedor;
    }
    
    
    
    
    
    
    
}
