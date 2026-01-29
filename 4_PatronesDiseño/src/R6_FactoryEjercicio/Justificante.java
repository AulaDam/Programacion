package R6_FactoryEjercicio;

public class Justificante implements Documento {
    
    private String tipo;
    private String emisor;
    private double importe;
    
    public Justificante(String tipo, String emisor, double importe) {
        System.out.println("[-] Justificante creado");
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
