package R3_FactoryPrimero;

public abstract class EnvioCreator {
    
    //Factory method
    protected abstract IEnvio crearEnvio();
    
    //Logica en comun que van a tener todos los tipos de envio
    public void procesarEnvio() {
        IEnvio envio = crearEnvio(); //Llamar a nuestro factory method
        envio.enviarPaquete();
    }
   
    
    
    
    
}
