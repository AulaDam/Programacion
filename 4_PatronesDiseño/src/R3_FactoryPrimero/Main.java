package R3_FactoryPrimero;

public class Main {
    public static void main(String[] args) {
        
        EnvioCreator envioCorreo = new EnvioCorreoCreator();
        envioCorreo.procesarEnvio();
        
        EnvioCreator envioMoto = new EnvioMotoCreator();
        envioMoto.procesarEnvio();
        
        EnvioCreator envioCamion = new EnvioCamionCreator();
        envioCamion.procesarEnvio();
        
        
        
        
        
    }
    
}
