package R6_FactoryEjercicio;

public class Factura implements Documento {
    
    private String tipo;
    private String emisor;
    private double importe;
    
    public Factura(String tipo, String emisor, double importe) {
        System.out.println("[-] Factura creada");
        this.tipo = tipo;
        this.emisor = emisor;
        this.importe = importe;
        
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Emisor: " + emisor);
        System.out.println("Importe: " + importe);
    }
    
}
