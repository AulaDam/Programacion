package R3_FactoryPrimero;

public class EnvioMotoCreator extends EnvioCreator{

    @Override
    protected IEnvio crearEnvio() {
        return new EnvioMoto();
    }
    
}
