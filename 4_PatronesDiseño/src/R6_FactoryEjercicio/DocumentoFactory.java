package R6_FactoryEjercicio;

public class DocumentoFactory {
    
    public static Documento crearDocumento(String tipo, String emisor, double importe) {
        if (tipo.equalsIgnoreCase("factura")) {
            return new Factura(tipo, emisor, importe);
        } else if (tipo.equalsIgnoreCase("recibo")) {
            return new Recibo(tipo, emisor, importe);
        } else if (tipo.equalsIgnoreCase("justificante")) {
            return new Justificante(tipo, emisor, importe);
        }
        return null;
    }
    
}
