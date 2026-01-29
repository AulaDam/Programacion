package R5_FactoryVideo;

public class ConexionFactory {
    
    private String tipo;
    
    public ConexionFactory(String tipo) {
        this.tipo = tipo;
    }
    
    public Conexion crearConexion() {
        if (tipo.equalsIgnoreCase("oracle")) {
            return new Oracle();
        } else if (tipo.equalsIgnoreCase("sql")) {
            return new Sql();
        } else if (tipo.equalsIgnoreCase("postgress")) {
            return new Postgress();
        }
        return null;
    }
    
}
